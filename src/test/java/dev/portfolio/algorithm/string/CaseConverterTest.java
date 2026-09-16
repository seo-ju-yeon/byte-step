package dev.portfolio.algorithm.string;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class CaseConverterTest {

    private final CaseConverter caseConverter = new CaseConverter();

    @Test
    void solve() {
        log.info("--- 소문자를 대문자로 변환 메서드 ---");

        String result = caseConverter.solve("qwer");
        log.info("result: {}", result);

        assertEquals("QWER", result);
    }

    @Test
    void solve_1() {
        log.info("--- 대문자를 소문자로 변환 메서드 ---");

        String result = caseConverter.solve("ASDF");
        log.info("result: {}", result);

        assertEquals("asdf", result);
    }
}