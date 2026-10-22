package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisorCounterTest {

    private final DivisorCounter divisorCounter = new DivisorCounter();

    @Test
    void n이_6이면_약수의_개수인_4를_반환한다() {
        assertEquals(4, divisorCounter.solve(6));
    }

    @Test
    void n이_10이면_약수의_개수인_4를_반환한다() {
        assertEquals(4, divisorCounter.solve(10));
    }

    @Test
    void n이_소수이면_1과_자기_자신만_약수이므로_2를_반환한다() {
        assertEquals(2, divisorCounter.solve(7));
    }

    @Test
    void n이_1이면_유일한_약수가_1이므로_1을_반환한다() {
        assertEquals(1, divisorCounter.solve(1));
    }

    @Test
    void n이_제곱수이면_제곱근을_중복으로_세지_않는다() {
        // 9의 약수는 1, 3, 9
        assertEquals(3, divisorCounter.solve(9));
    }

    @Test
    void 입력의_최댓값인_10000의_약수_개수를_구한다() {
        assertEquals(25, divisorCounter.solve(10_000));
    }
}
