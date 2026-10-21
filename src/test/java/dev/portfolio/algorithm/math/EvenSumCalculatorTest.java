package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenSumCalculatorTest {

    private final EvenSumCalculator evenSumCalculator = new EvenSumCalculator();

    @Test
    void n이_짝수이면_n까지_포함하여_짝수의_합을_구한다() {
        assertEquals(30, evenSumCalculator.solve(10));
    }

    @Test
    void n이_홀수이면_n보다_작은_짝수들의_합을_구한다() {
        assertEquals(6, evenSumCalculator.solve(5));
    }

    @Test
    void n이_1이면_짝수가_없으므로_0을_반환한다() {
        assertEquals(0, evenSumCalculator.solve(1));
    }

    @Test
    void n이_2이면_유일한_짝수인_2를_반환한다() {
        assertEquals(2, evenSumCalculator.solve(2));
    }

    @Test
    void 입력의_최댓값인_10000까지_짝수의_합을_구한다() {
        assertEquals(25_005_000, evenSumCalculator.solve(10_000));
    }
}
