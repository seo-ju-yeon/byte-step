package dev.portfolio.designpattern.mvc.lotto.model;

import java.util.List;

public class LottoResultChecker {

    public LottoRank check(
            List<Integer> ticketNumbers,
            List<Integer> winningNumbers,
            int bonusNumber
    ) {
        int matchCount = 0;

        for (int ticketNumber : ticketNumbers) {

            // equals(): 두 대상 전체가 같은지 비교
            // contains(): List 안에 특정 값이 있는지 비교
            if (winningNumbers.contains(ticketNumber)) {
                matchCount++;
            }
        }

        boolean bonusMatched = ticketNumbers.contains(bonusNumber);

        if (matchCount == 6) {
            return LottoRank.FIRST;
        }

        if (matchCount == 5 && bonusMatched) {
            return LottoRank.SECOND;
        }

        if (matchCount == 5) {
            return LottoRank.THIRD;
        }

        if (matchCount == 4) {
            return LottoRank.FOURTH;
        }

        if (matchCount == 3) {
            return LottoRank.FIFTH;
        }

        return LottoRank.NONE;

    }
}
