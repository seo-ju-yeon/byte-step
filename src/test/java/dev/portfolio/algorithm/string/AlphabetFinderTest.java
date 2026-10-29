package dev.portfolio.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AlphabetFinderTest {

    private final AlphabetFinder alphabetFinder = new AlphabetFinder();

    @Test
    void 각_알파벳의_위치를_찾고_없는_알파벳은_마이너스1을_반환한다() {
        int[] expected = {
                0, 1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
        };

        assertArrayEquals(expected, alphabetFinder.findPositions("abc"));
    }

    @Test
    void 같은_알파벳이_반복되면_처음_등장한_위치만_반환한다() {
        int[] expected = {
                1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
        };

        assertArrayEquals(expected, alphabetFinder.findPositions("banana"));
    }

    @Test
    void z_한_글자도_마지막_배열_칸에_위치를_기록한다() {
        int[] expected = {
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0
        };

        assertArrayEquals(expected, alphabetFinder.findPositions("z"));
    }

    @Test
    void 모든_알파벳이_순서대로_있으면_0부터_25까지_반환한다() {
        int[] expected = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
                13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25
        };

        assertArrayEquals(expected, alphabetFinder.findPositions("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void 백준_예제의_알파벳_위치를_반환한다() {
        int[] expected = {
                1, 0, -1, -1, 2, -1, -1, -1, -1, 4, 3, -1, -1,
                7, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1
        };

        assertArrayEquals(expected, alphabetFinder.findPositions("baekjoon"));
    }
}
