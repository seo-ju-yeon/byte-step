package dev.portfolio.algorithm.array;

/**
 * 정수 배열에서 짝수와 홀수의 개수를 구한다.
 *
 * <p>반환 배열의 첫 번째 값은 짝수의 개수이고, 두 번째 값은 홀수의 개수이다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[1, 2, 3, 4, 6] → [3, 2]</li>
 *     <li>[2, 4, 8] → [3, 0]</li>
 *     <li>[1, 3, 5] → [0, 3]</li>
 * </ul>
 *
 * <p>제한 조건: numbers에는 하나 이상의 정수가 들어 있다.</p>
 */
public class EvenOddCounter {

    public int[] solve(int[] numbers) {
        int evenCount = 0; // 짝수
        int oddCount = 0;  // 홀수

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }
}
