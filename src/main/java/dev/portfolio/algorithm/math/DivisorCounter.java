package dev.portfolio.algorithm.math;

/**
 * 정수 n이 주어지면 n의 양의 약수 개수를 반환한다.
 *
 * <p>약수는 n을 나누었을 때 나머지가 0이 되는 수이다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>6 → 4 (1, 2, 3, 6)</li>
 *     <li>10 → 4 (1, 2, 5, 10)</li>
 *     <li>7 → 2 (1, 7)</li>
 *     <li>1 → 1 (1)</li>
 * </ul>
 *
 * <p>제한 조건: n은 1 이상 10,000 이하의 정수이다.</p>
 */
public class DivisorCounter {

    public int solve(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            // n을 i로 나누어떨어지면 i는 n의 약수
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }
}
