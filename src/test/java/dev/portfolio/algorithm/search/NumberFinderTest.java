package dev.portfolio.algorithm.search;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class NumberFinderTest {

    private final NumberFinder numberFinder = new NumberFinder();

    @Test
    void 숫자의_존재_여부를_질문_순서대로_반환한다() {

        int[] numbers = {4, 1, 7, 3};
        int[] queries = {3, 2, 7};

        int[] result = numberFinder.solve(numbers, queries);
        log.info("--- result: {} ---", result);

        // 배열의 내용끼리 비교할땐 assertEquals 대신 assertArrayEquals 사용
        assertArrayEquals(new int[]{1, 0, 1}, result);
    }

    @Test
    void 중복된_입력_음수_없는숫자_반복된_질문을_확인() {

        int[] numbers = {5, 5, -2};
        int[] queries = {5, -2, 0, 5};

        int[] result = numberFinder.solve(numbers, queries);
        log.info("--- result: {} ---", result);

        assertArrayEquals(new int[]{1, 1, 0, 1}, result);
    }

}