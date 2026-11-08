package dev.portfolio.designpattern.templatemethod.beverage;

import java.util.ArrayList;
import java.util.List;

/**
 * 템플릿 메서드 패턴 연습 문제: 커피와 차 만들기.
 *
 * <p>문제: 커피와 차는 같은 순서로 준비하지만 일부 단계의 내용은 다르다.
 * 부모 클래스에 공통 작업과 전체 순서를 정의하고,
 * 자식 클래스에서 음료마다 달라지는 단계를 구현한다.</p>
 *
 * <p>만들어야 할 클래스:</p>
 * <ul>
 *     <li>{@code BeverageMaker}: 공통 작업과 준비 순서를 정의하는 추상 클래스.</li>
 *     <li>{@code CoffeeMaker}: BeverageMaker를 상속하여 커피 준비 단계를 구현한다.</li>
 *     <li>{@code TeaMaker}: BeverageMaker를 상속하여 차 준비 단계를 구현한다.</li>
 * </ul>
 *
 * <p>작업 순서와 메서드:</p>
 * <ol>
 *     <li>{@code boilWater()}: 공통 단계. {@code "물 끓이기"}를 반환한다.</li>
 *     <li>{@code brew()}: 음료별 단계. 커피는 {@code "커피 추출하기"},
 *         차는 {@code "찻잎 우리기"}를 반환한다.</li>
 *     <li>{@code pourInCup()}: 공통 단계. {@code "컵에 따르기"}를 반환한다.</li>
 *     <li>{@code addCondiments()}: 음료별 단계. 커피는 {@code "설탕과 우유 추가하기"},
 *         차는 {@code "레몬 추가하기"}를 반환한다.</li>
 * </ol>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>BeverageMaker는 {@code abstract class}로 선언한다.</li>
 *     <li>boilWater()와 pourInCup()은 부모 클래스에서 구현하며,
 *         반환 타입은 String, 접근 제어자는 private으로 지정한다.</li>
 *     <li>brew()와 addCondiments()는 부모에 {@code protected abstract String} 메서드로
 *         선언하고 두 자식 클래스에서 각각 구현한다.</li>
 *     <li>부모의 {@code public final List<String> prepare()}가 위 네 메서드를 순서대로
 *         호출하고, 각 반환값을 순서대로 담은 목록을 반환한다.</li>
 *     <li>prepare()를 final로 선언해 자식 클래스가 전체 준비 순서를 재정의하지 못하게 한다.</li>
 *     <li>부모 클래스에서 instanceof나 음료 종류에 따른 if/switch 분기를 사용하지 않는다.</li>
 *     <li>prepare()를 여러 번 호출해도 결과는 네 단계이며, 이전 호출의 결과가 누적되지 않는다.</li>
 * </ul>
 *
 * <p>예상 결과:</p>
 * <ul>
 *     <li>커피: {@code ["물 끓이기", "커피 추출하기", "컵에 따르기", "설탕과 우유 추가하기"]}</li>
 *     <li>차: {@code ["물 끓이기", "찻잎 우리기", "컵에 따르기", "레몬 추가하기"]}</li>
 * </ul>
 *
 * <p>제한 조건: 각 단계는 실제 음료를 만들거나 콘솔에 출력하지 않고,
 * 위에 지정한 작업 설명 문자열을 반환한다. prepare()에는 입력 매개변수가 없다.</p>
 *
 * <p>테스트 목표: BeverageMakerTest에서 커피와 차의 전체 결과 목록을 비교해
 * 내용과 순서를 확인한다. BeverageMaker 타입의 변수로 두 자식 객체를 사용해보고,
 * 같은 객체에서 prepare()를 반복 호출해도 단계가 누적되지 않는지 확인한다.</p>
 */
public abstract class BeverageMaker {
    // abstract class: 공통 구현과 미완성 메서드를 함께 둘 수 있는 추상 클래스 (직접 객체 만들 수 없음)
    // abstract 메서드: 본문 {} 없이 선언하고, 구체적인 구현은 자식 클래스가 정의함
    // protected: 같은 패키지와 자식 클래스에서 사용할 수 있도록 접근 범위를 정함

    // 커피 추출 또는 찻잎 우리기
    protected abstract String brew();

    // 설탕, 우유 또는 레몬 추가하기
    protected abstract String addCondiments();

    private String boilWater() {
        return "물 끓이기";
    }

    private String pourInCup() {
        return "컵에 따르기";
    }

    public final List<String> prepare() {
        List<String> steps = new ArrayList<>();

        steps.add(boilWater());
        steps.add(brew());
        steps.add(pourInCup());
        steps.add(addCondiments());

        return steps;
    }
}
