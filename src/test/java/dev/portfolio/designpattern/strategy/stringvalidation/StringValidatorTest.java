package dev.portfolio.designpattern.strategy.stringvalidation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    private final StringValidator validator = new StringValidator(List.of(
            new AllowedLengthStrategy(),
            new DigitsOnlyStrategy()
    ));

    @Test
    void 네_자리_숫자_문자열은_검사를_통과한다() {
        assertTrue(validator.isValid("1234"));
    }

    @Test
    void 여섯_자리_숫자_문자열은_검사를_통과한다() {
        assertTrue(validator.isValid("123456"));
    }

    @Test
    void 다섯_자리_숫자_문자열은_길이_검사에서_실패한다() {
        assertFalse(validator.isValid("12345"));
    }

    @Test
    void 길이가_4여도_문자가_섞여_있으면_숫자_검사에서_실패한다() {
        assertFalse(validator.isValid("123a"));
    }

}