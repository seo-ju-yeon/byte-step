package dev.portfolio.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void 최솟값_1은_숫자_문자열로_반환한다() {
        assertArrayEquals(new String[]{"1"}, fizzBuzz.solve(1));
    }

    @Test
    void 예시_5까지_숫자와_Fizz와_Buzz를_순서대로_반환한다() {
        assertArrayEquals(
                new String[]{"1", "2", "Fizz", "4", "Buzz"},
                fizzBuzz.solve(5)
        );
    }

    @Test
    void 공배수_15는_FizzBuzz로_반환한다() {
        assertArrayEquals(
                new String[]{
                        "1", "2", "Fizz", "4", "Buzz",
                        "Fizz", "7", "8", "Fizz", "Buzz",
                        "11", "Fizz", "13", "14", "FizzBuzz"
                },
                fizzBuzz.solve(15)
        );
    }

    @Test
    void 최댓값_100까지_변환하며_뒤쪽의_공배수도_처리한다() {
        String[] result = fizzBuzz.solve(100);

        assertEquals(100, result.length);
        assertEquals("FizzBuzz", result[29]);
        assertEquals("FizzBuzz", result[89]);
        assertEquals("97", result[96]);
        assertEquals("Fizz", result[98]);
        assertEquals("Buzz", result[99]);
    }
}
