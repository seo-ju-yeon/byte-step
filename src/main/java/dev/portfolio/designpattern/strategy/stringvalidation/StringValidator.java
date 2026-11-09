package dev.portfolio.designpattern.strategy.stringvalidation;

import java.util.List;

public class StringValidator {
    // StringValidator: 검사 전략들을 받아, 모두 통과했을 때만 true 반환

    private final List<StringValidationStrategy> strategies;

    public StringValidator(List<StringValidationStrategy> strategies) {
        this.strategies = List.copyOf(strategies);
    }

    public boolean isValid(String text) {
        for (StringValidationStrategy strategy : strategies) {
            if (!strategy.isValid(text)) {
                return false;
            }
        }

        return true;
    }
}
