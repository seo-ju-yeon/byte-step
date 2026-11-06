package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ArrayReverserTest {

    private final ArrayReverser arrayReverser = new ArrayReverser();

    @Test
    @DisplayName("짝수 길이 배열의 원소 순서를 뒤집는다")
    void reversesEvenLengthArray() {
        int[] result = arrayReverser.solve(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{4, 3, 2, 1}, result);
    }

    @Test
    @DisplayName("음수, 0, 중복 원소가 있는 홀수 길이 배열을 뒤집는다")
    void reversesOddLengthArray() {
        int[] result = arrayReverser.solve(new int[]{-3, 0, 2, 2, 5});

        assertArrayEquals(new int[]{5, 2, 2, 0, -3}, result);
    }

    @Test
    @DisplayName("원소가 하나이면 같은 값을 가진 새 배열을 반환한다")
    void returnsNewArrayForSingleElement() {
        int[] numbers = {7};

        int[] result = arrayReverser.solve(numbers);

        assertArrayEquals(new int[]{7}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("빈 배열이면 새 빈 배열을 반환한다")
    void returnsNewEmptyArray() {
        int[] numbers = {};

        int[] result = arrayReverser.solve(numbers);

        assertArrayEquals(new int[]{}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("원본 배열을 변경하지 않고 새 배열을 반환한다")
    void preservesOriginalArray() {
        int[] numbers = {1, 2, 3, 4};

        int[] result = arrayReverser.solve(numbers);

        assertArrayEquals(new int[]{1, 2, 3, 4}, numbers);
        assertNotSame(numbers, result);
    }
}
