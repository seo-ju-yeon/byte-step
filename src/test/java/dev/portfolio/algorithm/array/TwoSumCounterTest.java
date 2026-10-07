package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumCounterTest {

    private final TwoSumCounter twoSumCounter = new TwoSumCounter();

    @Test
    void 정렬되지_않은_배열에서_정답_쌍을_모두_센다() {

        int[] numbers = {5, 1, 4, 2, 3};
        int target = 6;

        assertEquals(2, twoSumCounter.solve(numbers, target));

    }

    @Test
    void 합이_작을_때_더_큰_숫자를_찾아간다() {

        int[] numbers = {1, 3, 4, 6};
        int target = 10;

        assertEquals(1, twoSumCounter.solve(numbers, target));

    }

    @Test
    void 합이_클_때_더_작은_숫자를_찾아간다() {

        int[] numbers = {1, 4, 6, 9};
        int target = 7;

        assertEquals(1, twoSumCounter.solve(numbers, target));

    }

    @Test
    void 정답_쌍이_없으면_0을_반환한다() {

        int[] numbers = {1, 2, 4, 8};
        int target = 7;

        assertEquals(0, twoSumCounter.solve(numbers, target));

    }

    @Test
    void 숫자가_하나면_쌍을_만들지_않는다() {

        int[] numbers = {5};
        int target = 10;

        assertEquals(0, twoSumCounter.solve(numbers, target));

    }

}