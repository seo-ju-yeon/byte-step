package dev.portfolio.algorithm.array;

/**
 * 정수 배열에서 최솟값과 최댓값을 찾는다.
 *
 * <p>반환 배열의 첫 번째 값은 최솟값이고, 두 번째 값은 최댓값이다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[20, 10, 35, 30, 7] → [7, 35]</li>
 *     <li>[5] → [5, 5]</li>
 *     <li>[-3, -1, -7] → [-7, -1]</li>
 * </ul>
 *
 * <p>제한 조건: numbers에는 하나 이상의 정수가 들어 있다.</p>
 */
public class MinMaxFinder {

    public int[] solve(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        return new int[]{min, max};
    }
}
