package dev.portfolio.algorithm.map;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class NumberCardCounterTest {

    private final NumberCardCounter numberCardCounter = new NumberCardCounter();

    @Test
    void 중복된_카드와_없는_카드의_개수를_구한다() {

        int[] cards = {6, 3, 6, 1, 6, 3};
        int[] queries = {6, 3, 2};

        int[] actual = numberCardCounter.solve(cards, queries);

        assertArrayEquals(new int[]{3, 2, 0}, actual);
    }

    @Test
    void 카드가_한_장이어도_같은_숫자를_여러_번_조회할_수_있다() {

        int[] cards = {5};
        int[] queries = {5, 7, 5};

        int[] actual = numberCardCounter.solve(cards, queries);

        assertArrayEquals(new int[]{1, 0, 1}, actual);
    }
}