package dev.portfolio.algorithm.array;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class AverageCalculatorTest {

    private final AverageCalculator averageCalculator = new AverageCalculator();

    @Test
    void solve() {
        log.info("--- 정수 배열에 들어 있는 모든 숫자의 평균을 구함 ---");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        double result = averageCalculator.solve(numbers);
        log.info("result: {}", result);

        assertEquals(4.5, result);
    }
}