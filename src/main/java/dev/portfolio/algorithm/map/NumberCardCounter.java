package dev.portfolio.algorithm.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 백준 10816번 '숫자 카드 2'를 메서드 형태로 푼다.
 *
 * <p>cards에 들어 있는 숫자 카드 중에서 queries의 각 숫자가 몇 장 있는지
 * 질문 순서대로 반환한다. 같은 숫자의 카드는 여러 장 있을 수 있다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>cards = [6, 3, 6, 1, 6, 3]</li>
 *     <li>queries = [6, 3, 2]</li>
 *     <li>결과 = [3, 2, 0]</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>cards와 queries에는 각각 하나 이상의 정수가 들어 있다.</li>
 *     <li>cards에 없는 숫자를 질문하면 0을 반환한다.</li>
 *     <li>결과 배열의 길이와 순서는 queries와 같다.</li>
 * </ul>
 */
public class NumberCardCounter {

    public int[] solve(int[] cards, int[] queries) {
        // getOrDefault(키, 기본값)은 Map에서 키를 찾고, 없으면 지정한 기본 값을 돌려줌
        //  -> 읽기만 하므로 Map에 새 값을 저장하는 것은 put임

        // 개수를 저장
        Map<Integer, Integer> count = new HashMap<>();

        // 카드 세기
        for (int i = 0; i < cards.length; i++) {
            int card = cards[i];
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        // 답을 담을 배열
        int[] result = new int[queries.length];

        // 질문 순서대로 답 채움
        for (int i = 0; i < queries.length; i++) {
            result[i] = count.getOrDefault(queries[i], 0);
        }

        return result;
    }
}
