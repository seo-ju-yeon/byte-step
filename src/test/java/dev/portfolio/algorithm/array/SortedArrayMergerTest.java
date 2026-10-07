package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayMergerTest {

    private final SortedArrayMerger sortedArrayMerger = new SortedArrayMerger();

    @Test
    void 첫_번째_배열이_먼저_끝나면_두_번째_배열의_남은_값을_넣는다() {

        int[] first = {1, 4, 7};
        int[] second = {2, 3, 8};
        int[] result = {1, 2, 3, 4, 7, 8};

        assertArrayEquals(result, sortedArrayMerger.solve(first, second));
    }

    @Test
    void 두_번째_배열이_먼저_끝나면_첫_번째_배열의_남은_값을_넣는다() {

        int[] first = {1, 4, 7};
        int[] second = {2, 3};
        int[] result = {1, 2, 3, 4, 7};

        assertArrayEquals(result, sortedArrayMerger.solve(first, second));

    }

    @Test
    void 같은_숫자가_있어도_중복을_유지한다() {

        int[] first = {1, 2};
        int[] second = {2, 2};
        int[] result = {1, 2, 2, 2};

        assertArrayEquals(result, sortedArrayMerger.solve(first, second));

    }

    @Test
    void 음수와_양수를_오름차순으로_합친다() {

        int[] first = {-3, 1};
        int[] second = {-2, 0};
        int[] result = {-3, -2, 0, 1};

        assertArrayEquals(result, sortedArrayMerger.solve(first, second));

    }

}
