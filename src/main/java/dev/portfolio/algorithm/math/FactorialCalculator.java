package dev.portfolio.algorithm.math;

/**
 * 정수 n이 주어지면 1부터 n까지 모두 곱한 값인 팩토리얼(n!)을 반환한다.
 *
 * <p>0의 팩토리얼은 1로 정의한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>5 → 120 (1 × 2 × 3 × 4 × 5)</li>
 *     <li>3 → 6 (1 × 2 × 3)</li>
 *     <li>1 → 1</li>
 *     <li>0 → 1</li>
 * </ul>
 *
 * <p>제한 조건: n은 0 이상 10 이하의 정수이다.</p>
 */
public class FactorialCalculator {

    public int solve(int n) {
        // 곱셈 결과를 누적하므로 1로 시작
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // n이 0이면 반복문이 실행되지 않아 1을 반환
        return result;
    }
}
