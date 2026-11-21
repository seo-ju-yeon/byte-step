package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelCounterTest {

    private final VowelCounter vowelCounter = new VowelCounter();

    @Test
    @DisplayName("일반 단어에 포함된 모음 개수를 센다")
    void countsVowelsInWord() {
        assertEquals(2, vowelCounter.solve("Hello"));
    }

    @Test
    @DisplayName("대문자로 된 단어의 모음도 센다")
    void countsUppercaseVowelsInWord() {
        assertEquals(2, vowelCounter.solve("JAVA"));
    }

    @Test
    @DisplayName("모음이 없으면 0을 반환하며 y는 모음으로 세지 않는다")
    void returnsZeroWithoutVowels() {
        assertEquals(0, vowelCounter.solve("sky"));
        assertEquals(0, vowelCounter.solve("BCDFGHJKLMNPQRSTVWXYZ"));
    }

    @Test
    @DisplayName("다섯 모음을 대소문자와 관계없이 센다")
    void countsEveryVowelInBothCases() {
        assertEquals(5, vowelCounter.solve("aeiou"));
        assertEquals(5, vowelCounter.solve("AEIOU"));
        assertEquals(10, vowelCounter.solve("aAeEiIoOuU"));
    }

    @Test
    @DisplayName("같은 모음이 반복되어도 각각 센다")
    void countsRepeatedVowels() {
        assertEquals(4, vowelCounter.solve("aAaA"));
    }

    @Test
    @DisplayName("길이가 1인 문자열에서 모음과 자음을 구분한다")
    void handlesSingleCharacter() {
        assertEquals(1, vowelCounter.solve("U"));
        assertEquals(0, vowelCounter.solve("b"));
    }

    @Test
    @DisplayName("문자열의 첫 문자와 마지막 문자도 확인한다")
    void countsVowelsAtBothEnds() {
        assertEquals(2, vowelCounter.solve("AbcdE"));
    }

    @Test
    @DisplayName("최대 길이 문자열의 모음을 모두 센다")
    void handlesMaximumLength() {
        assertEquals(100, vowelCounter.solve("aE".repeat(50)));
        assertEquals(50, vowelCounter.solve("bU".repeat(50)));
    }
}
