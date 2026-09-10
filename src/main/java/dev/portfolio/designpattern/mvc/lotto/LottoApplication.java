package dev.portfolio.designpattern.mvc.lotto;

import dev.portfolio.designpattern.mvc.lotto.controller.LottoController;
import dev.portfolio.designpattern.mvc.lotto.model.LottoGenerator;
import dev.portfolio.designpattern.mvc.lotto.view.LottoView;

import javax.swing.SwingUtilities;

public class LottoApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LottoGenerator generator = new LottoGenerator();
            LottoView view = new LottoView();

            new LottoController(generator, view);
        });
    }
}
