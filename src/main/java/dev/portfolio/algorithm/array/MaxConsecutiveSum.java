package dev.portfolio.algorithm.array;

/**
 * 백준 2559번 '수열'을 메서드 형태로 푼다.
 *
 * <p>날짜순으로 기록된 온도에서 연속된 k일의 합을 구하고,
 * 그중 가장 큰 값을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>temperatures = [3, -2, 5, 1], k = 2 → 6</li>
 *     <li>temperatures = [-5, -2, -3], k = 2 → -5</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>temperatures에는 하나 이상의 정수가 들어 있다.</li>
 *     <li>k는 1 이상 temperatures의 길이 이하이다.</li>
 *     <li>온도는 음수일 수 있다.</li>
 * </ul>
 */
public class MaxConsecutiveSum {

    public int solve(int[] temperatures, int k) {

        int currentSum = 0;

        // 처음 k의 값
        for (int i = 0; i < k; i++) {
            currentSum += temperatures[i];
        }

        int maxSum = currentSum;

        // 구간을 오른쪽으로 한 칸씩 이동
        for (int i = k; i < temperatures.length; i++) {
            currentSum -= temperatures[i - k];  // 빠지는 온도
            currentSum += temperatures[i];  // 들어오는 온도

            // maxSum과 currentSum을 비교해 최댓값 갱신
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
