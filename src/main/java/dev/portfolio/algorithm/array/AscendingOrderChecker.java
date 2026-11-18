package dev.portfolio.algorithm.array;

/**
 * 배열의 값이 앞에서부터 작아지지 않으면 true를 반환한다.
 *
 * <p>같은 값이 연속으로 나오는 것은 허용하며, 원본 배열은 변경하지 않는다.</p>
 * <ul>
 *     <li>[1, 2, 3, 4] → true</li>
 *     <li>[1, 2, 2, 5] → true</li>
 *     <li>[1, 3, 2, 4] → false</li>
 *     <li>[7] → true</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 1 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.</p>
 */
public class AscendingOrderChecker {

    public boolean solve(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
