package dev.portfolio.algorithm.array;

/**
 * 정수 배열에 들어 있는 모든 숫자의 평균을 구한다.
 *
 * <p>배열의 숫자를 모두 더한 뒤 배열의 길이로 나누어 소수점을 포함한 평균을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[10, 20, 30] → 20.0</li>
 *     <li>[1, 2] → 1.5</li>
 *     <li>[7] → 7.0</li>
 * </ul>
 *
 * <p>제한 조건: numbers에는 하나 이상의 정수가 들어 있다.</p>
 */
public class AverageCalculator {

    public double solve(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
