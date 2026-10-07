package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortedArrayUniqueMergerTest {

    private final SortedArrayUniqueMerger merger = new SortedArrayUniqueMerger();

    @Test
    void 두_배열에_걸친_중복을_한_번만_반환한다() {
        int[] first = {1, 2, 2};
        int[] second = {2, 3, 3};

        assertArrayEquals(new int[]{1, 2, 3}, merger.solve(first, second));
    }

    @Test
    void 모든_숫자가_같으면_하나만_반환한다() {
        int[] first = {5, 5};
        int[] second = {5, 5};

        assertArrayEquals(new int[]{5}, merger.solve(first, second));
    }

    @Test
    void 음수와_0의_중복도_제거한다() {
        int[] first = {-3, -1, 0, 0};
        int[] second = {-3, -2, 0, 2};

        assertArrayEquals(new int[]{-3, -2, -1, 0, 2}, merger.solve(first, second));
    }

    @Test
    void 첫_번째_배열이_먼저_끝나도_남은_숫자를_합친다() {
        int[] first = {1};
        int[] second = {2, 3, 3};

        assertArrayEquals(new int[]{1, 2, 3}, merger.solve(first, second));
    }

    @Test
    void 두_번째_배열이_먼저_끝나도_남은_숫자를_합친다() {
        int[] first = {1, 3, 4, 4};
        int[] second = {2};

        assertArrayEquals(new int[]{1, 2, 3, 4}, merger.solve(first, second));
    }

    @Test
    void 중복이_없으면_모든_숫자를_오름차순으로_반환한다() {
        int[] first = {1, 4, 7};
        int[] second = {2, 3, 8};

        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 8}, merger.solve(first, second));
    }
}
