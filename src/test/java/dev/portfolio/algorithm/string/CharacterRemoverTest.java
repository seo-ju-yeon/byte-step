package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterRemoverTest {

    private final CharacterRemover characterRemover = new CharacterRemover();

    @Test
    @DisplayName("여러 위치에 있는 대상 문자를 모두 제거한다")
    void removesAllOccurrences() {
        assertEquals("bnn", characterRemover.solve("banana", 'a'));
    }

    @Test
    @DisplayName("연속된 대상 문자를 제거하고 남은 순서를 유지한다")
    void removesConsecutiveOccurrences() {
        assertEquals("Heo", characterRemover.solve("Hello", 'l'));
    }

    @Test
    @DisplayName("대상 문자가 없으면 원래 문자열과 같은 값을 반환한다")
    void preservesTextWithoutTarget() {
        assertEquals("Java", characterRemover.solve("Java", 'x'));
    }

    @Test
    @DisplayName("모든 문자가 대상 문자이면 빈 문자열을 반환한다")
    void returnsEmptyWhenAllMatch() {
        assertEquals("", characterRemover.solve("aaa", 'a'));
    }

    @Test
    @DisplayName("대문자와 소문자를 구분해서 제거한다")
    void distinguishesUpperAndLowerCase() {
        assertEquals("AAb", characterRemover.solve("aAaAb", 'a'));
        assertEquals("aab", characterRemover.solve("aAaAb", 'A'));
    }

    @Test
    @DisplayName("첫 문자와 마지막 문자도 제거한다")
    void removesFirstAndLastCharacters() {
        assertEquals("bc", characterRemover.solve("abca", 'a'));
    }

    @Test
    @DisplayName("길이가 1인 문자열에서 일치 여부를 처리한다")
    void handlesSingleCharacter() {
        assertEquals("", characterRemover.solve("a", 'a'));
        assertEquals("a", characterRemover.solve("a", 'b'));
    }

    @Test
    @DisplayName("최대 길이 문자열의 마지막 문자까지 확인한다")
    void handlesMaximumLength() {
        String text = "ab".repeat(50);

        assertEquals("a".repeat(50), characterRemover.solve(text, 'b'));
    }
}
