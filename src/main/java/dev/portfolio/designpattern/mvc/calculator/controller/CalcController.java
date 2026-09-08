package dev.portfolio.designpattern.mvc.calculator.controller;

import dev.portfolio.designpattern.mvc.calculator.model.CalcModel;
import dev.portfolio.designpattern.mvc.calculator.view.CalcView;

import javax.swing.*;

public class CalcController {

    private final CalcModel model;
    private final CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;

        view.addPlusButtonListener(event -> calculate());
    }

    public void calculate() {
        int num1 = Integer.parseInt(view.getFirstNumText());
        int num2 = Integer.parseInt(view.getSecondNumText());
        int num3 = Integer.parseInt(view.getThirdNumText());

        int result = model.plus(num1, num2, num3);

        view.showResult(result);
    }

}
