package dev.portfolio.algorithm.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1부터 n까지 번호가 적힌 카드를 순서대로 놓고, 마지막에 남는 카드 번호를 구한다.
 *
 * <p>카드가 한 장 남을 때까지 다음 동작을 반복한다.</p>
 * <ol>
 *     <li>가장 앞에 있는 카드를 버린다.</li>
 *     <li>그다음 가장 앞에 있는 카드를 맨 뒤로 옮긴다.</li>
 * </ol>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>n = 1 → 1</li>
 *     <li>n = 2 → 2</li>
 *     <li>n = 6 → 4</li>
 * </ul>
 *
 * <p>제한 조건: n은 1 이상의 자연수이다.</p>
 */
public class CardQueue {
    /*
    poll(): Queue 방식
    pop(): Stack 방식
    -> 저장 공간이 비어있을 때 poll은 null을 반환, pop은 예외를 발생시킴

    - Queue: offer() + poll() -> 먼저 넣은 값부터 처리
    - Stack: push() + pop() -> 마지막에 넣은 값부터 처리
     */

    public int solve(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n은 1 이상이어야 합니다.");
        }

        Queue<Integer> cards = new ArrayDeque<>();

        for (int number = 1; number <= n; number++) {
            cards.offer(number);  // 카드를 맨 뒤에 추가

        }

        while (cards.size() > 1) {

            // poll은 비어있으면 Null 반환
//            cards.poll();  // 첫 번째 카드 버리기
            cards.remove();  // 비어있으면 NoSuchElementException 발생

            int card = cards.remove();  // 다음 카드 꺼내기 (가장 앞의 카드를 꺼내면서 삭제)
            cards.offer(card);  // 꺼낸 카드를 맨 뒤로 이동
        }

        return cards.remove();
    }
}
