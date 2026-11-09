package dev.portfolio.designpattern.strategy.stringvalidation;

public class AllowedLengthStrategy implements StringValidationStrategy {
    // AllowedLengthStrategy: 문자열 길이가 4 또는 6인지 검사

    @Override
    public boolean isValid(String text) {
        int length = text.length();
        return length == 4 || length == 6;
    }
}
