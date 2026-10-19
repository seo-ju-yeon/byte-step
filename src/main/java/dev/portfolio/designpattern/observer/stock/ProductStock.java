package dev.portfolio.designpattern.observer.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * 옵저버 패턴을 사용해 상품의 재입고를 구독자에게 알린다.
 *
 * <p>상품의 재고는 0개에서 시작한다. 재고가 0개에서 1개 이상으로 바뀌는 순간,
 * 현재 등록된 구독자 모두에게 새 재고 수량을 알린다.</p>
 *
 * <p>예시:</p>
 * <ol>
 *     <li>재고 0개 → 5개: 구독자에게 5개라고 알린다.</li>
 *     <li>재고 5개 → 8개: 이미 재고가 있으므로 알리지 않는다.</li>
 *     <li>재고 8개 → 0개: 품절은 재입고가 아니므로 알리지 않는다.</li>
 *     <li>재고 0개 → 3개: 다시 재입고되었으므로 3개라고 알린다.</li>
 * </ol>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>{@code RestockSubscriber} 인터페이스에 새 재고 수량을 받는
 *         {@code onRestocked(int stock)} 메서드를 선언한다.</li>
 *     <li>{@code subscribe(RestockSubscriber subscriber)}로 구독자를 등록한다.</li>
 *     <li>{@code unsubscribe(RestockSubscriber subscriber)}로 구독자를 해제한다.</li>
 *     <li>{@code setStock(int newStock)}으로 재고를 변경한다.</li>
 *     <li>재고가 0개에서 양수로 바뀔 때만 현재 구독자들에게 한 번씩 알린다.</li>
 *     <li>구독 전에 일어난 재입고는 나중에 구독한 사람에게 다시 알리지 않는다.</li>
 * </ul>
 *
 * <p>제한 조건: 새 재고 수량은 0 이상이고, 같은 구독자를 중복 등록하지 않는다.
 * 구독자는 null이 아니며, 구독자가 없어도 재고를 변경할 수 있다.</p>
 */
public class ProductStock {

    private int stock = 0;
    // subscribers: 재입고 알림을 받을 사람들의 목록
    private final List<RestockSubscriber> subscribers = new ArrayList<>();

    public void setStock(int newStock) {
        // 변경 전후를 비교
        boolean restocked = stock == 0 && newStock > 0;
        // 현재 재고를 새 값으로 저장
        stock = newStock;

        if (restocked) {
            for (RestockSubscriber subscriber : subscribers) {
                subscriber.onRestocked(newStock);
            }
        }

    }

    // 구독 등록
    public void subscribe(RestockSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    // 구독 해제
    public void unsubscribe(RestockSubscriber subscriber) {
        subscribers.remove(subscriber);
    }
}