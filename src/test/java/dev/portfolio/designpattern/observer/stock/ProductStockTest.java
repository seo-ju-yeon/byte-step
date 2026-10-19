package dev.portfolio.designpattern.observer.stock;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductStockTest {

    private final ProductStock productStock = new ProductStock();
    private final RestockCustomer restockCustomer = new RestockCustomer();

    @Test
    void 품절_상태에서_재고가_생기면_알린다() {
        productStock.subscribe(restockCustomer);
        productStock.setStock(5);

        assertEquals(List.of(5), restockCustomer.getReceivedStocks());
    }

    @Test
    void 재고가_있는_상태에서_수량이_늘어나도_알리지_않는다() {
        productStock.subscribe(restockCustomer);

        productStock.setStock(5);  // 0 -> 5 : 알림
        productStock.setStock(8);  // 5 -> 8 : 알림 없음

        assertEquals(List.of(5), restockCustomer.getReceivedStocks());
    }

    @Test
    void 품절됐다가_다시_재입고되면_다시_알린다() {
        productStock.subscribe(restockCustomer);

        productStock.setStock(5); // 0 -> 5: 알림
        productStock.setStock(0); // 5 -> 0: 알림 없음
        productStock.setStock(3); // 0 -> 3: 다시 알림

        assertEquals(List.of(5, 3), restockCustomer.getReceivedStocks());
    }

    @Test
    void 구독을_해제하면_다음_재입고_알림을_받지_않는다() {
        RestockCustomer otherCustomer = new RestockCustomer();

        productStock.subscribe(restockCustomer);
        productStock.subscribe(otherCustomer);
        productStock.setStock(5);

        productStock.unsubscribe(restockCustomer);
        productStock.setStock(0);
        productStock.setStock(3);

        assertEquals(List.of(5), restockCustomer.getReceivedStocks());
        assertEquals(List.of(5, 3), otherCustomer.getReceivedStocks());
    }

    @Test
    void 나중에_구독하면_이전_재입고_알림은_받지_않는다() {
        productStock.setStock(5); // 아직 구독자가 없음
        productStock.subscribe(restockCustomer);

        assertEquals(List.of(), restockCustomer.getReceivedStocks());

        productStock.setStock(0);
        productStock.setStock(3); // 구독한 뒤의 재입고

        assertEquals(List.of(3), restockCustomer.getReceivedStocks());
    }

    @Test
    void 구독자가_없어도_재고를_변경할_수_있다() {
        assertDoesNotThrow(() -> productStock.setStock(5));
    }

    @Test
    void 재고가_계속_0이면_알리지_않는다() {
        productStock.subscribe(restockCustomer);

        productStock.setStock(0);

        assertEquals(List.of(), restockCustomer.getReceivedStocks());
    }
}