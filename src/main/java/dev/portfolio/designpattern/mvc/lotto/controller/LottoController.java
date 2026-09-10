package dev.portfolio.designpattern.mvc.lotto.controller;

import dev.portfolio.designpattern.mvc.lotto.model.LottoGenerator;
import dev.portfolio.designpattern.mvc.lotto.model.LottoRank;
import dev.portfolio.designpattern.mvc.lotto.model.LottoResultChecker;
import dev.portfolio.designpattern.mvc.lotto.view.LottoView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    private List<Integer> ticketNumbers;
    private final LottoResultChecker resultChecker;
    private final LottoGenerator generator;
    private final LottoView view;

    public LottoController(
            LottoGenerator generator,
            LottoResultChecker resultChecker,
            LottoView view
    ) {
        this.generator = generator;
        this.resultChecker = resultChecker;
        this.view = view;

        // 번호 생성 버튼을 누르면 generateNumbers()가 호출되도록 연결
        view.addGenerateButtonListener(event -> generateNumbers());
        view.addCheckResultButtonListener(event -> checkResult());
    }

    private void generateNumbers() {
        List<Integer> numbers = generator.generate();
        ticketNumbers = generator.generate();

        view.showNumbers(numbers);
        view.showNumbers(ticketNumbers);
    }

    private void checkResult() {
        if (ticketNumbers == null) {
            view.showRank("먼저 번호를 생성해 주세요.");
            return;
        }

        // 당첨 변호 변환
        String[] numberTexts = view.getWinningNumbersText().split(",");
        List<Integer> winningNumbers = new ArrayList<>();

        for (String numberText : numberTexts) {
            winningNumbers.add(Integer.parseInt(numberText.trim()));
        }

        // 보너스 번호 변환
        int bonusNumber =
                Integer.parseInt(view.getBonusNumberText().trim());

        // 등수 판별
        LottoRank rank =
                resultChecker.check(ticketNumbers, winningNumbers, bonusNumber);

        // 화면 출력
        view.showRank(rank.name());
    }

}
