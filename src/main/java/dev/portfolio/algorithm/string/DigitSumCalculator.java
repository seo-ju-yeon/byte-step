package dev.portfolio.algorithm.string;

/**
 * 숫자로만 이루어진 문자열에서 각 자리 숫자의 합을 구한다.
 *
 * <p>문자열의 문자를 하나씩 숫자로 변환한 뒤 모두 더해 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"54321" → 15</li>
 *     <li>"100" → 1</li>
 *     <li>"7" → 7</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>number는 숫자 문자('0'부터 '9')로만 이루어져 있다.</li>
 *     <li>number의 길이는 1 이상이다.</li>
 * </ul>
 */
public class DigitSumCalculator {

    public int solve(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);

            int digit = digitChar - '0';  // 실제 숫자가 됨
            sum += digit;
        }

        return sum;
    }
}
