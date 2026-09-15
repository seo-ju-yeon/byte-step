package dev.portfolio.algorithm.array;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class MinMaxFinderTest {

    private final MinMaxFinder minMaxFinder = new MinMaxFinder();

    @Test
    void solve() {
         log.info("--- 정수 배역에서 최대값 최소값 찾기 ---");
         int[] numbers = {1, 7, 33, 89};

         int[] result = minMaxFinder.solve(numbers);
         log.info("result: {}", result);

         assertArrayEquals(new int[]{1, 89}, result);
    }
}