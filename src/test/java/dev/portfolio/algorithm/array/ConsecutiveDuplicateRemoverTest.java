package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ConsecutiveDuplicateRemoverTest {

    private final ConsecutiveDuplicateRemover remover = new ConsecutiveDuplicateRemover();

    @Test
    @DisplayName("연속된 중복을 제거하고 떨어진 중복은 유지한다")
    void removesOnlyConsecutiveDuplicates() {
        assertArrayEquals(new int[]{1, 3, 0, 1},
                remover.solve(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    @Test
    @DisplayName("배열의 시작과 끝에 있는 연속 중복을 제거한다")
    void removesLeadingAndTrailingDuplicates() {
        assertArrayEquals(new int[]{4, 3},
                remover.solve(new int[]{4, 4, 4, 3, 3}));
    }

    @Test
    @DisplayName("같은 숫자가 떨어져 있으면 모두 유지한다")
    void preservesSeparatedDuplicates() {
        assertArrayEquals(new int[]{1, 2, 1},
                remover.solve(new int[]{1, 2, 1}));
    }

    @Test
    @DisplayName("모든 원소가 같으면 하나만 남긴다")
    void keepsOneValueWhenAllEqual() {
        assertArrayEquals(new int[]{0}, remover.solve(new int[]{0, 0, 0}));
    }

    @Test
    @DisplayName("음수와 0 및 원소의 경계값을 처리한다")
    void handlesNegativeZeroAndBoundaryValues() {
        assertArrayEquals(new int[]{-1_000, 0, 1_000, -1_000},
                remover.solve(new int[]{-1_000, -1_000, 0, 0, 1_000, 1_000, -1_000}));
    }

    @Test
    @DisplayName("원소가 하나이면 같은 값을 가진 새 배열을 반환한다")
    void returnsNewArrayForSingleElement() {
        int[] numbers = {7};

        int[] result = remover.solve(numbers);

        assertArrayEquals(new int[]{7}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("원본 배열을 변경하지 않고 새 배열을 반환한다")
    void preservesOriginalArray() {
        int[] numbers = {1, 1, 2, 2, 1};

        int[] result = remover.solve(numbers);

        assertArrayEquals(new int[]{1, 1, 2, 2, 1}, numbers);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("최대 길이에서 중복이 없으면 모든 원소를 유지한다")
    void preservesAllValuesAtMaximumLength() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i % 2;
        }

        int[] result = remover.solve(numbers);

        assertArrayEquals(numbers, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("최대 길이에서 모든 원소가 같아도 하나만 남긴다")
    void removesDuplicatesAtMaximumLength() {
        int[] numbers = new int[100];
        Arrays.fill(numbers, 5);

        assertArrayEquals(new int[]{5}, remover.solve(numbers));
    }
}
