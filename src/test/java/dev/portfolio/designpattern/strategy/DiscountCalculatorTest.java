package dev.portfolio.designpattern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    private final DiscountCalculator calculator = new DiscountCalculator();

    @Test
    void 십퍼센트_할인을_적용한다() {
        int result = calculator.calculate(
                10_000,
                new PercentDiscountPolicy(10));

        assertEquals(9_000, result);
    }

    @Test
    void 할인이_없으면_원래_가격을_반환하다() {
        int result = calculator.calculate(
                10_000,
                new NoDiscountPolicy());

        assertEquals(10_000, result);
    }

    @Test
    void 정책_할인을_적용한다() {
        int result = calculator.calculate(
                10_000,
                new FixedDiscountPolicy(2_000));

        assertEquals(8_000, result);
    }

    @Test
    void 할인_금액이_가격보다_크면_0원을_반환한다() {
        int result = calculator.calculate(
                1_000,
                new FixedDiscountPolicy(2_000));

        assertEquals(0, result);
    }

}