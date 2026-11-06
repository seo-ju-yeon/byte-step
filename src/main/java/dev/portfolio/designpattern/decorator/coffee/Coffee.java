package dev.portfolio.designpattern.decorator.coffee;

/**
 * 데코레이터 패턴을 사용해 커피에 옵션을 추가하고 가격과 설명을 계산한다.
 *
 * <p>기본 커피는 3,000원이며 설명은 "커피"이다.
 * 우유 옵션은 500원, 샷 옵션은 700원을 더한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>기본 커피 → 3,000원, "커피"</li>
 *     <li>기본 커피 + 우유 → 3,500원, "커피 + 우유"</li>
 *     <li>기본 커피 + 우유 + 샷 → 4,200원, "커피 + 우유 + 샷"</li>
 *     <li>기본 커피 + 샷 + 샷 → 4,400원, "커피 + 샷 + 샷"</li>
 * </ul>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>{@code Beverage} 인터페이스에 {@code getPrice()}와
 *         {@code getDescription()} 메서드를 선언한다.</li>
 *     <li>{@code Coffee}는 {@code Beverage}를 구현하고 기본 가격과 설명을 반환한다.</li>
 *     <li>{@code MilkDecorator}와 {@code ShotDecorator}는 {@code Beverage}를 구현한다.
 *         생성자로 기존 {@code Beverage} 객체를 받아 감싸고,
 *         그 객체의 가격과 설명에 각 옵션의 값과 이름을 더한다.</li>
 *     <li>옵션을 여러 번 겹쳐 적용할 수 있다. 설명에는 옵션을 적용한 순서대로 표시한다.</li>
 * </ul>
 *
 * <p>제한 조건: 옵션에 전달하는 {@code Beverage} 객체는 null이 아니며,
 * 가격과 옵션 금액은 위에 적힌 값으로 고정한다.</p>
 */
public class Coffee implements Beverage {

    @Override
    public int getPrice() {
        return 3000;
    }

    @Override
    public String getDescription() {
        return "커피";
    }

}
