package dev.portfolio.algorithm.queue;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class CardQueueTest {

    private final CardQueue cardQueue = new CardQueue();

    @Test
    void solve() {
        log.info("--- n이 1보다 작으면 예외가 발생 ---");

        assertThrows(
                IllegalArgumentException.class,
                () -> cardQueue.solve(0)
        );
    }

    @Test
    void solve_1() {
        log.info("--- n이 6이면 마지막 카드로 4를 반환 ---");
        int result = cardQueue.solve(6);

        log.info("result: {}", result);
        assertEquals(4, result);
    }

    @Test
    void solve_2() {
        log.info("--- 카드가 한장이면 해당 카드를 반환 ---");
        int result = cardQueue.solve(1);

        log.info("result: {}", result);
        assertEquals(1, result);
    }
}