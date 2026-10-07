package dev.portfolio.algorithm.search;

import java.util.HashSet;
import java.util.Set;

/**
 * 백준 1920번 '수 찾기'를 메서드 형태로 푼다.
 *
 * <p>numbers에 queries의 각 숫자가 있는지 확인하여 질문 순서대로 반환한다.
 * 있으면 1, 없으면 0을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>numbers = [4, 1, 7, 3]</li>
 *     <li>queries = [3, 2, 7]</li>
 *     <li>결과 = [1, 0, 1]</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>numbers와 queries에는 각각 하나 이상의 정수가 들어 있다.</li>
 *     <li>결과 배열의 길이와 순서는 queries와 같다.</li>
 * </ul>
 */
public class NumberFinder {

    public int[] solve(int[] numbers, int[] queries) {

        Set<Integer> numberSet = new HashSet<>();

        for (int number : numbers) {
            numberSet.add(number);
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            // Set에는 숫자 하나씩 저장했으므로, queries[i]를 확인해야함
            if (numberSet.contains(queries[i])) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }

        return result;
    }
}
