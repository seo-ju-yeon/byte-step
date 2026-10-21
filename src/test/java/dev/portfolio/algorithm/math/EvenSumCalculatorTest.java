package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenSumCalculatorTest {

    private final EvenSumCalculator evenSumCalculator = new EvenSumCalculator();

    @Test
    @DisplayName("n이 짝수이면 n까지 포함하여 짝수의 합을 구한다")
    void sumsEvenNumbersIncludingN() {
        assertEquals(30, evenSumCalculator.solve(10));
    }

    @Test
    @DisplayName("n이 홀수이면 n보다 작은 짝수들의 합을 구한다")
    void sumsEvenNumbersBelowOddN() {
        assertEquals(6, evenSumCalculator.solve(5));
    }

    @Test
    @DisplayName("n이 1이면 짝수가 없으므로 0을 반환한다")
    void returnsZeroWhenNIsOne() {
        assertEquals(0, evenSumCalculator.solve(1));
    }

    @Test
    @DisplayName("n이 2이면 유일한 짝수인 2를 반환한다")
    void returnsTwoWhenNIsTwo() {
        assertEquals(2, evenSumCalculator.solve(2));
    }

    @Test
    @DisplayName("입력의 최댓값인 10,000까지 짝수의 합을 구한다")
    void sumsEvenNumbersAtUpperBound() {
        assertEquals(25_005_000, evenSumCalculator.solve(10_000));
    }
}
