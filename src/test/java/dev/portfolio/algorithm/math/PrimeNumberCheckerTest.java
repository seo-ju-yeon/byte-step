package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberCheckerTest {

    private final PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

    @Test
    void n이_7이면_소수이므로_true를_반환한다() {
        assertTrue(primeNumberChecker.solve(7));
    }

    @Test
    void n이_10이면_소수가_아니므로_false를_반환한다() {
        assertFalse(primeNumberChecker.solve(10));
    }

    @Test
    void n이_2이면_가장_작은_소수이므로_true를_반환한다() {
        assertTrue(primeNumberChecker.solve(2));
    }

    @Test
    void n이_1이면_소수가_아니므로_false를_반환한다() {
        assertFalse(primeNumberChecker.solve(1));
    }

    @Test
    void n이_9이면_홀수여도_소수가_아니므로_false를_반환한다() {
        assertFalse(primeNumberChecker.solve(9));
    }

    @Test
    void n이_15이면_제곱수가_아닌_홀수여도_소수가_아니다() {
        assertFalse(primeNumberChecker.solve(15));
    }

    @Test
    void 입력의_최댓값인_10000은_소수가_아니다() {
        assertFalse(primeNumberChecker.solve(10_000));
    }
}
