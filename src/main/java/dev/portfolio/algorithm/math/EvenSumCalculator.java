package dev.portfolio.algorithm.math;

/**
 * 1부터 n까지의 정수 중 짝수의 합을 구한다.
 *
 * <p>n이 짝수이면 n도 합계에 포함한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>10 → 30 (2 + 4 + 6 + 8 + 10)</li>
 *     <li>5 → 6 (2 + 4)</li>
 *     <li>1 → 0 (짝수가 없음)</li>
 * </ul>
 *
 * <p>제한 조건: n은 1 이상 10,000 이하의 정수이다.</p>
 */
public class EvenSumCalculator {

    public int solve(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
