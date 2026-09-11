package dev.portfolio.algorithm.stack;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class ZeroCalculatorTest {

    private final ZeroCalculator zeroCalculator = new ZeroCalculator();

    @Test
    void solve() {
        log.info("0이 나오면 최근 숫자를 삭제한다.");
        int[] number = {3, 0, 4, 2, 0};  // 예상 합산 결과: 4

        int result = zeroCalculator.solve(number);

        log.info("결과: {}", result);
        assertEquals(4, result);
    }
}