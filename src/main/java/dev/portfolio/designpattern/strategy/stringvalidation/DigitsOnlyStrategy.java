package dev.portfolio.designpattern.strategy.stringvalidation;

public class DigitsOnlyStrategy implements StringValidationStrategy {
    // DigitsOnlyStrategy: 문자열의 각 문자가 0~9인지 검사

    @Override
    public boolean isValid(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }
}
