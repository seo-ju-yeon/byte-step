package dev.portfolio.algorithm.string;

/**
 * 괄호 문자열이 올바른 괄호 조합인지 판별한다.
 *
 * <p>여는 괄호 '('는 반드시 뒤에 오는 닫는 괄호 ')'와 짝을 이루어야 한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"()" → true</li>
 *     <li>"(())()" → true</li>
 *     <li>"(()" → false</li>
 *     <li>")(" → false</li>
 *     <li>"())(" → false</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>문자열은 '('와 ')'로만 이루어져 있다.</li>
 *     <li>문자열의 길이는 2 이상 50 이하이다.</li>
 * </ul>
 */
public class ParenthesesValidator {

    public boolean solve(String parentheses) {
        int openCount = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            char bracket = parentheses.charAt(i);

            // char 비교는 작은따옴표를 사용
            if (bracket == '(') {
                // '('이면 증가
                openCount++;
            } else {
                // ')'이면 감소
                openCount--;
            }

            // 닫는 괄호가 먼저 나오면 즉시 종료
            if (openCount < 0) {
                return false;
            }
        }

        return openCount == 0;
    }
}
