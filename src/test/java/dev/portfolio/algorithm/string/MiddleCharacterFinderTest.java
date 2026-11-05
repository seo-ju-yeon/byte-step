package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleCharacterFinderTest {

    private final MiddleCharacterFinder middleCharacterFinder = new MiddleCharacterFinder();

    @Test
    void 길이가_홀수이면_가운데_한_글자를_반환한다() {
        String result = middleCharacterFinder.solve("abcde");

        assertEquals("c", result);
    }

    @Test
    void 길이가_짝수이면_가운데_두_글자를_반환한다() {
        String result = middleCharacterFinder.solve("qwer");

        assertEquals("we", result);
    }

    @Test
    void 한_글자이면_그_글자를_반환한다() {
        String result = middleCharacterFinder.solve("a");

        assertEquals("a", result);
    }

    @Test
    void 두_글자이면_문자열_전체를_반환한다() {
        String result = middleCharacterFinder.solve("ab");

        assertEquals("ab", result);
    }

    @Test
    void 여섯_글자이면_세번째와_네번째_글자를_반환한다() {
        String result = middleCharacterFinder.solve("abcdef");

        assertEquals("cd", result);
    }

    @Test
    void 최대_길이인_백_글자에서도_가운데_두_글자를_반환한다() {
        // 49글자 + 가운데 2글자 + 49글자 = 총 100글자
        String text = "a".repeat(49) + "bc" + "d".repeat(49);

        String result = middleCharacterFinder.solve(text);

        assertEquals("bc", result);
    }
}
