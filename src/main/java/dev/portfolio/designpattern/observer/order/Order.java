package dev.portfolio.designpattern.observer.order;

import java.util.ArrayList;
import java.util.List;

/**
 * 옵저버 패턴을 사용해 주문 상태 변경을 등록된 객체들에게 알린다.
 *
 * <p>주문은 {@code ORDERED}(주문 완료) 상태에서 시작한다.
 * 상태가 실제로 바뀌었을 때만 현재 등록된 관찰자들에게 새 상태를 전달한다.</p>
 *
 * <p>예시:</p>
 * <ol>
 *     <li>고객 알림 객체와 주문 기록 객체를 등록한다.</li>
 *     <li>상태를 {@code SHIPPING}(배송 중)으로 바꾸면 둘 다 새 상태를 받는다.</li>
 *     <li>다시 {@code SHIPPING}으로 설정하면 상태가 같으므로 알리지 않는다.</li>
 *     <li>고객 알림 객체를 등록 해제하고 {@code DELIVERED}(배송 완료)로 바꾸면
 *         주문 기록 객체만 새 상태를 받는다.</li>
 * </ol>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>{@code OrderStatus} 열거형에 {@code ORDERED}, {@code SHIPPING},
 *         {@code DELIVERED}를 정의한다.</li>
 *     <li>{@code OrderObserver} 인터페이스에
 *         {@code onStatusChanged(OrderStatus status)} 메서드를 선언한다.</li>
 *     <li>{@code subscribe(OrderObserver observer)}로 관찰자를 등록하고,
 *         {@code unsubscribe(OrderObserver observer)}로 등록을 해제한다.</li>
 *     <li>{@code setStatus(OrderStatus newStatus)}로 상태를 변경한다.
 *         기존 상태와 다를 때만 현재 관찰자들에게 새 상태를 한 번씩 알린다.</li>
 *     <li>고객 알림 객체와 주문 기록 객체를 각각 {@code OrderObserver}로 구현한다.
 *         실제 알림 전송 대신, 전달받은 상태를 저장해 확인할 수 있게 한다.</li>
 *     <li>등록 전에 일어난 상태 변경은 나중에 등록한 관찰자에게 다시 알리지 않는다.</li>
 * </ul>
 *
 * <p>제한 조건: 상태는 null이 아니며, 같은 관찰자를 중복 등록하지 않는다.
 * 상태는 주문 완료 → 배송 중 → 배송 완료 순서로만 변경한다고 가정한다.</p>
 */
public class Order {

    private OrderStatus status = OrderStatus.ORDERED;
    // 상태 변경 알림을 받을 객체
    private final List<OrderObserver> observers = new ArrayList<>();

    public void subscribe(OrderObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(OrderStatus newStatus) {
        // 상태가 바뀌지 않은 것을 의미
        if (status == newStatus) {
            return;
        }

        status = newStatus;

        for (OrderObserver observer : observers) {
            // 새 주문상태를 알림
            observer.onStatusChanged(status);
        }
    }

}
