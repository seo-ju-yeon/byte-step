package dev.portfolio.algorithm.array;

/**
 * 각 위치에 처음부터 해당 위치까지의 누적 합을 담은 새 배열을 반환한다.
 *
 * <p>원본 배열은 변경하지 않는다.</p>
 * <ul>
 *     <li>[1, 2, 3, 4] → [1, 3, 6, 10]</li>
 *     <li>[3, -1, 2] → [3, 2, 4]</li>
 *     <li>[5] → [5]</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 1 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.</p>
 */
public class RunningSumCalculator {

    public int[] solve(int[] numbers) {
        int[] result = new int[numbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            result[i] = sum;
        }

        return result;
    }
}
