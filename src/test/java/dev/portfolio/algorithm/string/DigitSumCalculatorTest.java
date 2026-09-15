package dev.portfolio.algorithm.string;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class DigitSumCalculatorTest {

    private final DigitSumCalculator digitSumCalculator = new DigitSumCalculator();

    @Test
    void solve() {
        log.info("--- 문자열 숫자로 변환해서 합산하기 ---");

        int result = digitSumCalculator.solve("12345");
        log.info("result: {}", result);

        assertEquals(15, result);
    }
}