package dev.portfolio.designpattern.mvc.lotto.controller;

import dev.portfolio.designpattern.mvc.lotto.model.LottoGenerator;
import dev.portfolio.designpattern.mvc.lotto.view.LottoView;

import java.util.List;

public class LottoController {

    private final LottoGenerator generator;
    private final LottoView view;

    public LottoController(LottoGenerator generator, LottoView view) {
        this.generator = generator;
        this.view = view;

        // 번호 생성 버튼을 누르면 generateNumbers()가 호출되도록 연결
        view.addGenerateButtonListener(event -> generateNumbers());
    }

    private void generateNumbers() {
        List<Integer> numbers = generator.generate();

        view.showNumbers(numbers);
    }
}
