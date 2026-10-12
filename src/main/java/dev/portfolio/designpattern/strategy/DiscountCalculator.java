package dev.portfolio.designpattern.strategy;

/**
 * 전략 패턴을 사용해 상품의 최종 가격을 계산한다.
 *
 * <p>할인 방식에 따라 같은 상품 가격의 결과가 달라진다.</p>
 * <ul>
 *     <li>할인 없음: 10,000원 → 10,000원</li>
 *     <li>10% 할인: 10,000원 → 9,000원</li>
 *     <li>2,000원 할인: 10,000원 → 8,000원</li>
 * </ul>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>할인 방식을 나타내는 {@code DiscountPolicy} 인터페이스를 만든다.</li>
 *     <li>할인 없음, 정률 할인, 정액 할인을 각각 별도 클래스로 구현한다.</li>
 *     <li>이 계산기는 전달받은 할인 방식을 사용해 최종 가격을 반환한다.</li>
 *     <li>새 할인 방식을 추가할 때 이 계산기의 계산 코드를 수정하지 않아도 되게 한다.</li>
 *     <li>최종 가격은 0원보다 작아질 수 없다.</li>
 * </ul>
 *
 * <p>제한 조건: 상품 가격과 할인 금액은 0 이상이며, 할인율은 0% 이상 100% 이하이다.</p>
 */
public class DiscountCalculator {

    public int calculate(int price, DiscountPolicy policy) {
        return policy.apply(price);
    }

}
