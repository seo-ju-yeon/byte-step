package dev.portfolio.algorithm.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemainderCounterTest {

    private final RemainderCounter remainderCounter = new RemainderCounter();

    @Test
    void 모든_나머지가_다르면_10을_반환한다() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 어떤 양수를 자신보다 큰 수로 나누면, 몫은 0이고 나머지는 원래 숫자 그대로
        int result = remainderCounter.solve(numbers);

        assertEquals(10, result);
    }

    @Test
    void 모든_나머지가_같으면_1을_반환한다() {
        int[] numbers = {42, 84, 252, 420, 840, 126, 42, 84, 420, 126};
        // 모두 42의 배수, 서로 다른 나머지는 0 하나뿐
        int result = remainderCounter.solve(numbers);

        assertEquals(1, result);
    }

    @Test
    void 중복을_제외한_나머지의_개수를_반환한다() {
        int[] numbers = {39, 40, 41, 42, 43, 44, 82, 83, 84, 85};
        // 나머지: 39, 40, 41, 0, 1, 2, 40, 41, 0, 1
        // 중복제거: 0, 1, 2, 39, 40, 41 (6EA)
        int result = remainderCounter.solve(numbers);

        assertEquals(6, result);
    }
}
