package dev.portfolio.designpattern.mvc.lotto.model;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class LottoResultCheckerTest {

    private final LottoResultChecker lottoResultChecker = new LottoResultChecker();

    @Test
    void check() {
        List<Integer> ticketNumbers = List.of(1, 2, 3, 4, 5, 7);
        List<Integer> winningNumbers = List.of(1, 2, 3, 4, 5, 6);
        int bonusNumber = 7;

        LottoRank result = lottoResultChecker.check(ticketNumbers, winningNumbers, bonusNumber);
        log.info("--- {} ---", result);

        assertEquals(LottoRank.SECOND, result);

    }
}