package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondLargestFinderTest {

    private final SecondLargestFinder secondLargestFinder = new SecondLargestFinder();

    @Test
    void 순서가_섞인_배열에서_두_번째로_큰_수를_찾는다() {
        assertEquals(4, secondLargestFinder.solve(new int[]{3, 1, 5, 2, 4}));
    }

    @Test
    void 최댓값이_중복되어도_서로_다른_두_번째_값을_찾는다() {
        assertEquals(3, secondLargestFinder.solve(new int[]{5, 5, 3, 1}));
    }

    @Test
    void 음수만_있는_배열에서도_두_번째로_큰_수를_찾는다() {
        assertEquals(-2, secondLargestFinder.solve(new int[]{-1, -3, -2}));
    }

    @Test
    void 원소가_두_개이면_작은_값을_반환한다() {
        assertEquals(2, secondLargestFinder.solve(new int[]{2, 7}));
        assertEquals(2, secondLargestFinder.solve(new int[]{7, 2}));
    }

    @Test
    void 두_번째로_큰_값도_중복될_수_있다() {
        assertEquals(3, secondLargestFinder.solve(new int[]{3, 5, 3, 5, 1}));
    }

    @Test
    void 양수와_음수_사이의_0도_결과가_될_수_있다() {
        assertEquals(0, secondLargestFinder.solve(new int[]{-10, 0, 10}));
    }

    @Test
    void 원소의_최솟값과_최댓값을_처리한다() {
        assertEquals(-1_000, secondLargestFinder.solve(new int[]{1_000, -1_000}));
    }

    @Test
    void 최대_길이의_배열에서_반복되는_최댓값을_제외한다() {
        int[] numbers = new int[100];
        java.util.Arrays.fill(numbers, 1_000);
        numbers[99] = 999;

        assertEquals(999, secondLargestFinder.solve(numbers));
    }
}
