package dev.portfolio.algorithm.string;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class ParenthesesValidatorTest {

    private ParenthesesValidator parenthesesValidator;

    @BeforeEach
    void setUp() {
        parenthesesValidator = new ParenthesesValidator();
    }

    @Test
    void solve_test_1() {
        log.info("--- 테스트_1: 괄호의 짝이 맞으면 true 반환 ---");

        boolean result = parenthesesValidator.solve("(())()");

        log.info("테스트_1 결과: {}", result);
        assertTrue(result);
    }

    @Test
    void solve_test_2() {
        log.info("--- 테스트_2: 여는 괄호가 남으면 false 반환 ---");

        boolean result = parenthesesValidator.solve("(()");

        log.info("테스트_2 결과: {}", result);
        assertFalse(result);

    }

    @Test
    void solve_test_3() {
        log.info("--- 테스트_3: 닫는 괄호가 먼저 나오면 false 반환 ---");

        boolean result = parenthesesValidator.solve(")(");

        log.info("테스트_3 결과: {}", result);
        assertFalse(result);
    }

    @Test
    void solve_test_4() {
        log.info("--- 테스트_4: 닫는 괄호가 더 많으면 false 반환 ---");

        boolean result = parenthesesValidator.solve("())");

        log.info("테스트_4 결과: {}", result);
        assertFalse(result);
    }
}