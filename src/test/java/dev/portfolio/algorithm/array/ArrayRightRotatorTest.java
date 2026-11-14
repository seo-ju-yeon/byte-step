package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ArrayRightRotatorTest {

    private final ArrayRightRotator arrayRightRotator = new ArrayRightRotator();

    @Test
    @DisplayName("마지막 원소를 맨 앞으로 옮기고 나머지 순서를 유지한다")
    void rotatesRightByOne() {
        assertArrayEquals(new int[]{4, 1, 2, 3},
                arrayRightRotator.solve(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("중복 원소와 0이 있는 배열을 회전한다")
    void rotatesDuplicateValuesAndZero() {
        assertArrayEquals(new int[]{0, 5, 5},
                arrayRightRotator.solve(new int[]{5, 5, 0}));
    }

    @Test
    @DisplayName("원소가 하나이면 같은 값을 가진 새 배열을 반환한다")
    void returnsNewArrayForSingleElement() {
        int[] numbers = {7};

        int[] result = arrayRightRotator.solve(numbers);

        assertArrayEquals(new int[]{7}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("원소가 두 개이면 서로 위치를 바꾼다")
    void rotatesTwoElements() {
        assertArrayEquals(new int[]{2, 1},
                arrayRightRotator.solve(new int[]{1, 2}));
    }

    @Test
    @DisplayName("음수와 원소의 최솟값 및 최댓값을 처리한다")
    void rotatesNegativeAndBoundaryValues() {
        assertArrayEquals(new int[]{-1_000, 1_000, -5, 0},
                arrayRightRotator.solve(new int[]{1_000, -5, 0, -1_000}));
    }

    @Test
    @DisplayName("원본 배열을 변경하지 않고 새 배열을 반환한다")
    void preservesOriginalArray() {
        int[] numbers = {1, 2, 3, 4};

        int[] result = arrayRightRotator.solve(numbers);

        assertArrayEquals(new int[]{1, 2, 3, 4}, numbers);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("최대 길이 배열에서도 모든 원소를 한 칸씩 회전한다")
    void rotatesMaximumLengthArray() {
        int[] numbers = new int[100];
        int[] expected = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            expected[i] = i;
        }
        expected[0] = 100;

        assertArrayEquals(expected, arrayRightRotator.solve(numbers));
    }
}
