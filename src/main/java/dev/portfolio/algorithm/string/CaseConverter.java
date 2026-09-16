package dev.portfolio.algorithm.string;

/**
 * 문자열의 대문자는 소문자로, 소문자는 대문자로 변환한다.
 *
 * <p>문자열의 각 문자를 확인하여 반대되는 대소문자로 변환한 새로운 문자열을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"Java" → "jAVA"</li>
 *     <li>"Hello" → "hELLO"</li>
 *     <li>"ABC" → "abc"</li>
 *     <li>"xyz" → "XYZ"</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>word는 하나 이상의 영문자로 이루어져 있다.</li>
 *     <li>공백, 숫자, 특수문자는 입력되지 않는다.</li>
 * </ul>
 */
public class CaseConverter {

    public String solve(String word) {
        // String: String은 만들어진 문자열을 직접 변경할 수 없음.
        // StringBuilder: 문자를 계속 추가하거나 수정할 수 있음 (문자열을 하나씩 이어 붙여 만드는 도구)
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (Character.isUpperCase(character)) {
                result.append(Character.toLowerCase(character));
            } else {
                result.append(Character.toUpperCase(character));
            }
        }

        return result.toString();
    }
}
