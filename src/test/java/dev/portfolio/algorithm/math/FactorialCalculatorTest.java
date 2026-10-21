package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialCalculatorTest {

    private final FactorialCalculator factorialCalculator = new FactorialCalculator();

    @Test
    void n이_5이면_1부터_5까지_곱한_120을_반환한다() {
        assertEquals(120, factorialCalculator.solve(5));
    }

    @Test
    void n이_3이면_1부터_3까지_곱한_6을_반환한다() {
        assertEquals(6, factorialCalculator.solve(3));
    }

    @Test
    void n이_1이면_1을_반환한다() {
        assertEquals(1, factorialCalculator.solve(1));
    }

    @Test
    void n이_0이면_팩토리얼의_정의에_따라_1을_반환한다() {
        assertEquals(1, factorialCalculator.solve(0));
    }

    @Test
    void 입력의_최댓값인_10의_팩토리얼을_구한다() {
        assertEquals(3_628_800, factorialCalculator.solve(10));
    }
}
