package dev.portfolio.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class VisitCounterTest {

    @Test
    void getInstance를_여러_번_호출해도_같은_객체를_반환한다() {
        VisitCounter firstCounter = VisitCounter.getInstance();
        VisitCounter secondCounter = VisitCounter.getInstance();

        assertSame(firstCounter, secondCounter);
    }

    @Test
    void 서로_다른_변수에서도_방문_횟수를_공유한다() {
        VisitCounter firstCounter = VisitCounter.getInstance();
        VisitCounter secondCounter = VisitCounter.getInstance();
        int countBeforeIncrease = firstCounter.getCount();

        firstCounter.increase();

        assertEquals(countBeforeIncrease + 1, secondCounter.getCount());
    }
}
