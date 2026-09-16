package dev.portfolio.algorithm.array;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class EvenOddCounterTest {

    private final EvenOddCounter evenOddCounter = new EvenOddCounter();

    @Test
    void solve() {
        log.info("--- 배열에서 짝수, 홀수 개수 세기 ---");

        int[] numbers = {1, 1, 2, 2, 2, 3, 4, 5};

        int[] result = evenOddCounter.solve(numbers);
        log.info("result: {}", result);

        int[] expected = {4, 4};
        assertArrayEquals(expected, result);
    }
}