package dev.portfolio.algorithm.string;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class StringReverserTest {

    private final StringReverser stringReverser = new StringReverser();

    @Test
    void solve() {
        log.info("--- 문자열의 순서를 반대로 뒤집기 ---");

        String result = stringReverser.solve("가나다라");
        log.info("result: {}", result);

        assertEquals("라다나가", result);
    }
}