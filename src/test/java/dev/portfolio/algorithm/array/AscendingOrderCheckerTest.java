package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AscendingOrderCheckerTest {

    private final AscendingOrderChecker checker = new AscendingOrderChecker();

    @Test
    @DisplayName("값이 계속 커지면 true를 반환한다")
    void acceptsIncreasingValues() {
        assertTrue(checker.solve(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("연속된 같은 값을 허용한다")
    void acceptsEqualNeighbors() {
        assertTrue(checker.solve(new int[]{1, 2, 2, 5}));
    }

    @Test
    @DisplayName("모든 값이 같아도 true를 반환한다")
    void acceptsAllEqualValues() {
        assertTrue(checker.solve(new int[]{3, 3, 3}));
    }

    @Test
    @DisplayName("중간에서 값이 작아지면 false를 반환한다")
    void rejectsDecreaseInMiddle() {
        assertFalse(checker.solve(new int[]{1, 3, 2, 4}));
    }

    @Test
    @DisplayName("첫 비교에서 값이 작아지면 false를 반환한다")
    void rejectsDecreaseAtBeginning() {
        assertFalse(checker.solve(new int[]{3, 1, 2}));
    }

    @Test
    @DisplayName("마지막 값이 작아져도 false를 반환한다")
    void rejectsDecreaseAtEnd() {
        assertFalse(checker.solve(new int[]{1, 2, 3, 0}));
    }

    @Test
    @DisplayName("원소가 하나이면 true를 반환한다")
    void acceptsSingleElement() {
        assertTrue(checker.solve(new int[]{7}));
    }

    @Test
    @DisplayName("음수와 0 및 원소의 경계값을 비교한다")
    void handlesNegativeAndBoundaryValues() {
        assertTrue(checker.solve(new int[]{-1_000, -5, 0, 1_000}));
        assertFalse(checker.solve(new int[]{-1, -2}));
    }

    @Test
    @DisplayName("최대 길이 배열의 마지막 원소까지 검사한다")
    void checksMaximumLengthArray() {
        int[] numbers = new int[100];
        Arrays.fill(numbers, 1_000);
        assertTrue(checker.solve(numbers));

        numbers[99] = -1_000;
        assertFalse(checker.solve(numbers));
    }

    @Test
    @DisplayName("검사 결과와 관계없이 원본 배열을 변경하지 않는다")
    void preservesOriginalArray() {
        int[] ascending = {1, 2, 2, 5};
        int[] unsorted = {1, 3, 2, 4};

        assertTrue(checker.solve(ascending));
        assertFalse(checker.solve(unsorted));

        assertArrayEquals(new int[]{1, 2, 2, 5}, ascending);
        assertArrayEquals(new int[]{1, 3, 2, 4}, unsorted);
    }
}
