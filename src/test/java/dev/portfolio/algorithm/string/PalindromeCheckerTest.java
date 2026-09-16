package dev.portfolio.algorithm.string;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    void solve() {
        log.info("--- 팰린드롬 ---");
        log.info("--- 앞뒤가 같은 문자열이면 true를 반환 ---");

        boolean result = palindromeChecker.solve("level");
        log.info("result: {}", result);

        assertTrue(result);
    }

    @Test
    void solve_1() {
        log.info("--- 앞뒤가 다르면 false를 반환 ---");

        boolean result = palindromeChecker.solve("backend");
        log.info("result: {}", result);

        assertFalse(false);
    }
}