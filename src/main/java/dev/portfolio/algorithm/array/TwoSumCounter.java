package dev.portfolio.algorithm.array;

import java.util.Arrays;

/**
 * 백준 3273번 '두 수의 합'을 메서드 형태로 푼다.
 *
 * <p>서로 다른 양의 정수 중에서 두 수의 합이 target인 쌍의 개수를 반환한다.
 * 같은 쌍은 순서만 바꿔 다시 세지 않는다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>numbers = [1, 2, 3, 4, 5], target = 6 → 2 (1+5, 2+4)</li>
 *     <li>numbers = [1, 2, 4], target = 8 → 0</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>numbers에는 하나 이상의 서로 다른 양의 정수가 들어 있다.</li>
 *     <li>target은 양의 정수이다.</li>
 *     <li>한 숫자를 자기 자신과 짝지을 수 없다.</li>
 * </ul>
 */
public class TwoSumCounter {

    public int solve(int[] numbers, int target) {

        // 오름차순으로 정렬
        Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length - 1;
        int count = 0;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                // 작으면 더 큰 합이 필요하므로 left 옮김
                // 더 큰 숫자를 선택해 합을 키움
                left++;
            } else {
                // 크면 작은 합이 필요하므로 right 옮김
                // 더 작은 숫자를 선택해 합을 줄임
                right--;
            }
        }

        return count;
    }
}
