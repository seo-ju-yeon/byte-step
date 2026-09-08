package dev.portfolio.algorithm.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DigitCounterTest {

    private final DigitCounter digitCounter = new DigitCounter();

    @Test
    void 세_수의_곱에_등장하는_각_숫자의_개수를_반환한다() {
        int[] result = digitCounter.solve(150, 266, 427);
        // 150 * 266 * 427 = 17,037,300
        int[] expected = {3, 1, 0, 2, 0, 0, 0, 2, 0, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    void 같은_숫자가_여러_번_등장하는_경우를_처리한다() {
        int[] result = digitCounter.solve(100, 100, 100);
        // 100 * 100 * 100 = 1,000,000
        int[] expected = {6, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, result);
    }

    @Test
    void 등장하지_않는_숫자의_개수는_0이다() {
        int[] result = digitCounter.solve(999, 999, 999);
        // 999 * 999 * 999 = 997,002,999
        int[] expected = {2, 0, 1, 0, 0, 0, 0, 1, 0, 5};
        assertArrayEquals(expected, result);
    }
}
