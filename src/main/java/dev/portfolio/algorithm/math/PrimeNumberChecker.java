package dev.portfolio.algorithm.math;

/**
 * 정수 n이 주어지면 소수인지 판별하여 true 또는 false를 반환한다.
 *
 * <p>소수는 1보다 크고, 양의 약수가 1과 자기 자신뿐인 수이다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>7 → true (약수가 1과 7뿐임)</li>
 *     <li>10 → false (2와 5로도 나누어떨어짐)</li>
 *     <li>2 → true (가장 작은 소수)</li>
 *     <li>1 → false (소수가 아님)</li>
 * </ul>
 *
 * <p>제한 조건: n은 1 이상 10,000 이하의 정수이다.</p>
 */
public class PrimeNumberChecker {

    public boolean solve(int n) {
        if (n == 1) {
            return false;
        }

        // 1과 자기 자신을 제외한 약수가 있는지 확인
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
