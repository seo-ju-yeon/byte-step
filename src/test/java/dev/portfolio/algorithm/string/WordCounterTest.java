package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    private final WordCounter wordCounter = new WordCounter();

    @Test
    void 문장에_있는_단어의_개수를_센다() {
        String text = "java is fun";
        assertEquals(3, wordCounter.solve(text));
    }

    @Test
    void 앞뒤에_공백이_있어도_단어만_센다() {
        String text = " Hello world ";
        assertEquals(2, wordCounter.solve(text));
    }

    @Test
    void 단어가_하나면_1을_반환한다() {
        String text = "word";
        assertEquals(1, wordCounter.solve(text));
    }

    @Test
    void 공백만_있으면_0을_반환한다() {
        String text = " ";
        assertEquals(0, wordCounter.solve(text));
    }

}