package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void 합이_목표값이_되는_인덱스를_반환한다() {
        int[] result = twoSum.solve(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void 같은_값도_서로_다른_원소라면_사용할_수_있다() {
        int[] result = twoSum.solve(new int[]{3, 3}, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void 음수가_포함된_배열도_처리한다() {
        int[] result = twoSum.solve(new int[]{-3, 4, 3, 90}, 0);

        assertArrayEquals(new int[]{0, 2}, result);
    }
}
