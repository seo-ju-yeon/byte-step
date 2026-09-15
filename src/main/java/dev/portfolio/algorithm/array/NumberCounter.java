package dev.portfolio.algorithm.array;

/**
 * 정수 배열에서 특정 숫자가 등장하는 횟수를 구한다.
 *
 * <p>배열의 각 숫자를 확인하여 target과 같은 값의 개수를 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>numbers = [1, 4, 1, 2, 4, 1], target = 1 → 3</li>
 *     <li>numbers = [2, 3, 4], target = 1 → 0</li>
 *     <li>numbers = [5], target = 5 → 1</li>
 * </ul>
 *
 * <p>제한 조건: numbers에는 하나 이상의 정수가 들어 있다.</p>
 */
public class NumberCounter {

    public int solve(int[] numbers, int target) {
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        return count;
    }
}
