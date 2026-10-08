package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveSumTest {

    private final MaxConsecutiveSum maxConsecutiveSum = new MaxConsecutiveSum();

    @Test
    void 연속된_k일의_합_중_최댓값을_구한다() {
        assertEquals(6, maxConsecutiveSum.solve(new int[]{3, -2, 5, 1}, 2));
    }

    @Test
    void 모든_온도가_음수여도_최댓값을_구한다() {
        assertEquals(-5, maxConsecutiveSum.solve(new int[]{-5, -2, -3}, 2));
    }

    @Test
    void k가_1이면_가장_높은_온도를_반환한다() {
        assertEquals(7, maxConsecutiveSum.solve(new int[]{2, -4, 7}, 1));
    }

    @Test
    void k가_전체_길이면_전체_합을_반환한다() {
        assertEquals(2, maxConsecutiveSum.solve(new int[]{1, -2, 3}, 3));
    }

}