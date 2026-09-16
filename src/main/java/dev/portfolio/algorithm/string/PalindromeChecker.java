package dev.portfolio.algorithm.string;

/**
 * 문자열이 팰린드롬인지 판별한다.
 *
 * <p>팰린드롬은 앞에서 읽은 결과와 뒤에서 읽은 결과가 같은 문자열을 의미한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"level" → true</li>
 *     <li>"abba" → true</li>
 *     <li>"hello" → false</li>
 *     <li>"a" → true</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>word는 하나 이상의 문자로 이루어져 있다.</li>
 *     <li>대문자와 소문자는 서로 다른 문자로 취급한다.</li>
 * </ul>
 */
public class PalindromeChecker {

    public boolean solve(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
