package dev.portfolio.designpattern.observer.order;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private final Order order = new Order();
    private final CustomerNotifier customerNotifier = new CustomerNotifier();
    private final OrderHistory orderHistory = new OrderHistory();

    @Test
    void 상태가_바뀌면_모든_관찰자에게_알린다() {
        order.subscribe(customerNotifier);  // 고객 알림 객체 등록
        order.subscribe(orderHistory);  // 주문 기록 객체 등록

        order.setStatus(OrderStatus.SHIPPING);  // 주문 상태를 배송중으로 변경

        assertEquals(
                List.of(OrderStatus.SHIPPING),
                customerNotifier.getReceivedStatuses()
        );
        assertEquals(
                List.of(OrderStatus.SHIPPING),
                orderHistory.getStatuses()
        );
    }

    @Test
    void 같은_상태를_다시_설정하면_알리지_않는다() {
        order.subscribe(customerNotifier);
        order.subscribe(orderHistory);

        // 같은 상태를 다시 설정
        order.setStatus(OrderStatus.SHIPPING);
        order.setStatus(OrderStatus.SHIPPING);

        assertEquals(
                List.of(OrderStatus.SHIPPING),
                customerNotifier.getReceivedStatuses()
        );
        assertEquals(
                List.of(OrderStatus.SHIPPING),
                orderHistory.getStatuses()
        );
    }

    @Test
    void 등록을_해제하면_이후_상태_변경을_받지_않는다() {
        order.subscribe(customerNotifier);
        order.subscribe(orderHistory);

        order.setStatus(OrderStatus.SHIPPING);
        order.unsubscribe(customerNotifier);
        order.setStatus(OrderStatus.DELIVERED);

        // SHIPPING은 둘 다 받고, 구독 해지한 뒤 DELIVERED는 주문 기록 객체만 받음
        assertEquals(
                List.of(OrderStatus.SHIPPING),
                customerNotifier.getReceivedStatuses()
        );
        assertEquals(
                List.of(OrderStatus.SHIPPING, OrderStatus.DELIVERED),
                orderHistory.getStatuses()
        );
    }

    @Test
    void 나중에_등록한_관찰자는_이전_상태_변경을_받지_않는다() {
        order.setStatus(OrderStatus.SHIPPING);

        order.subscribe(customerNotifier);
        order.setStatus(OrderStatus.DELIVERED);

        // SHIPPING으로 바뀐 뒤에 구독했으므로, DELIVERED 알림만 받아야함
        assertEquals(
                List.of(OrderStatus.DELIVERED),
                customerNotifier.getReceivedStatuses()
        );
    }

    @Test
    void 관찰자가_없어도_상태를_변경할_수_있다() {
        // assertDoesNotThrow: 안의 코드를 실행했을 때 예외가 없으면 통과
        assertDoesNotThrow(() -> order.setStatus(OrderStatus.SHIPPING));
    }
}