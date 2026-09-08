package dev.portfolio.designpattern.mvc.calculator;

import dev.portfolio.designpattern.mvc.calculator.controller.CalcController;
import dev.portfolio.designpattern.mvc.calculator.model.CalcModel;
import dev.portfolio.designpattern.mvc.calculator.view.CalcView;

import javax.swing.*;

public class CalculatorApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcModel model = new CalcModel();
            CalcView view = new CalcView();

            new CalcController(model, view);
        });
    }
}
