package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class RunningSumCalculatorTest {

    private final RunningSumCalculator calculator = new RunningSumCalculator();

    @Test
    @DisplayName("양수 배열의 누적 합을 구한다")
    void calculatesPositiveRunningSum() {
        assertArrayEquals(new int[]{1, 3, 6, 10},
                calculator.solve(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("양수와 음수가 섞인 배열의 누적 합을 구한다")
    void calculatesMixedRunningSum() {
        assertArrayEquals(new int[]{3, 2, 4},
                calculator.solve(new int[]{3, -1, 2}));
    }

    @Test
    @DisplayName("음수만 있는 배열의 누적 합을 구한다")
    void calculatesNegativeRunningSum() {
        assertArrayEquals(new int[]{-1, -3, -6},
                calculator.solve(new int[]{-1, -2, -3}));
    }

    @Test
    @DisplayName("0을 더해도 이전 누적 합이 유지된다")
    void handlesZeros() {
        assertArrayEquals(new int[]{0, 5, 5, 0, 0},
                calculator.solve(new int[]{0, 5, 0, -5, 0}));
    }

    @Test
    @DisplayName("원소가 하나이면 같은 값을 가진 새 배열을 반환한다")
    void returnsNewArrayForSingleElement() {
        int[] numbers = {5};

        int[] result = calculator.solve(numbers);

        assertArrayEquals(new int[]{5}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("원본 배열을 변경하지 않고 새 배열을 반환한다")
    void preservesOriginalArray() {
        int[] numbers = {1, 2, 3, 4};

        int[] result = calculator.solve(numbers);

        assertArrayEquals(new int[]{1, 2, 3, 4}, numbers);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("최대 길이에서 최댓값의 누적 합을 구한다")
    void handlesMaximumValuesAtMaximumLength() {
        int[] numbers = new int[100];
        Arrays.fill(numbers, 1_000);
        int[] expected = new int[100];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = (i + 1) * 1_000;
        }

        assertArrayEquals(expected, calculator.solve(numbers));
    }

    @Test
    @DisplayName("최대 길이에서 최솟값의 누적 합을 구한다")
    void handlesMinimumValuesAtMaximumLength() {
        int[] numbers = new int[100];
        Arrays.fill(numbers, -1_000);
        int[] expected = new int[100];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = (i + 1) * -1_000;
        }

        assertArrayEquals(expected, calculator.solve(numbers));
    }
}
