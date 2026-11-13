package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ZeroMoverTest {

    private final ZeroMover zeroMover = new ZeroMover();

    @Test
    @DisplayName("중간에 섞인 0을 모두 뒤로 이동한다")
    void movesMixedZerosToEnd() {
        assertArrayEquals(new int[]{1, 3, 12, 0, 0},
                zeroMover.solve(new int[]{0, 1, 0, 3, 12}));
    }

    @Test
    @DisplayName("앞에 연속된 0을 뒤로 이동한다")
    void movesLeadingZerosToEnd() {
        assertArrayEquals(new int[]{5, 0, 0},
                zeroMover.solve(new int[]{0, 0, 5}));
    }

    @Test
    @DisplayName("0이 없어도 같은 값을 가진 새 배열을 반환한다")
    void returnsNewArrayWithoutZeros() {
        int[] numbers = {1, 2, 3};

        int[] result = zeroMover.solve(numbers);

        assertArrayEquals(new int[]{1, 2, 3}, result);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("모든 원소가 0이면 그대로 반환한다")
    void handlesAllZeros() {
        assertArrayEquals(new int[]{0, 0, 0},
                zeroMover.solve(new int[]{0, 0, 0}));
    }

    @Test
    @DisplayName("음수와 중복 원소의 순서를 유지한다")
    void preservesOrderOfNegativeAndDuplicateValues() {
        assertArrayEquals(new int[]{-1_000, 5, -1_000, 1_000, 0, 0},
                zeroMover.solve(new int[]{0, -1_000, 5, 0, -1_000, 1_000}));
    }

    @Test
    @DisplayName("원소가 하나인 배열을 처리한다")
    void handlesSingleElement() {
        assertArrayEquals(new int[]{0}, zeroMover.solve(new int[]{0}));
        assertArrayEquals(new int[]{7}, zeroMover.solve(new int[]{7}));
    }

    @Test
    @DisplayName("원본 배열을 변경하지 않고 새 배열을 반환한다")
    void preservesOriginalArray() {
        int[] numbers = {0, 1, 0, 3, 12};

        int[] result = zeroMover.solve(numbers);

        assertArrayEquals(new int[]{0, 1, 0, 3, 12}, numbers);
        assertNotSame(numbers, result);
    }

    @Test
    @DisplayName("최대 길이 배열에서도 0을 뒤로 이동한다")
    void handlesMaximumLength() {
        int[] numbers = new int[100];
        numbers[99] = 1_000;
        int[] expected = new int[100];
        expected[0] = 1_000;

        assertArrayEquals(expected, zeroMover.solve(numbers));
    }
}
