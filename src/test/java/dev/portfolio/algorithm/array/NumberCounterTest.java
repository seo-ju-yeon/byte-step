package dev.portfolio.algorithm.array;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class NumberCounterTest {

    private final NumberCounter numberCounter = new NumberCounter();

    @Test
    void solve() {
        log.info("배열에서 target의 등장 횟수를 반환한다.");

        int[] numbers = {1, 1, 1, 7, 7, 7, 7, 8, 8};
        int target = 7;

        int result = numberCounter.solve(numbers, target);
        log.info("result: {}", result);

        assertEquals(4, result);
    }
}