package dev.portfolio.algorithm.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 정수 10개를 각각 42로 나눈 뒤, 서로 다른 나머지의 개수를 구한다.
 *
 * <p>예를 들어 모든 수가 42의 배수라면 나머지는 모두 0이므로
 * 서로 다른 나머지의 개수는 1이다.</p>
 *
 * <p>제한 조건: numbers의 길이는 10이고 각 원소는 0 이상 1,000 이하이다.</p>
 */
public class RemainderCounter {

    public int solve(int[] numbers) {
        // set에는 동일한 값을 여러 번 넣어도 하나만 저장됨
        Set<Integer> remainders = new HashSet<>();

        for (int number : numbers) {
            int remainder = number % 42;
            remainders.add(remainder);
        }

        return remainders.size();
    }
}
