package dev.portfolio.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSorterTest {

    private final NumberSorter numberSorter = new NumberSorter();

    @Test
    void 첫_번째_자리부터_정렬한다() {

        int[] result = numberSorter.solve(new int[]{2, 1});

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void 매_반복마다_새로정렬한다() {

        int[] result = numberSorter.solve(new int[]{5, 2, 3, 4, 1});

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void 음수정렬() {

        int[] result = numberSorter.solve(new int[]{3, -1, 0});

        assertArrayEquals(new int[]{-1, 0, 3}, result);
    }

    @Test
    void 숫자가_하나일때도_동작하는지_확인() {

        int[] result = numberSorter.solve(new int[]{7});

        assertArrayEquals(new int[]{7}, result);
    }

}