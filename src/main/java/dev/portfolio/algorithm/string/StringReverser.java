package dev.portfolio.algorithm.string;

/**
 * 문자열의 문자 순서를 반대로 뒤집는다.
 *
 * <p>문자열의 마지막 문자부터 첫 번째 문자까지 차례대로 이어 붙인 새로운 문자열을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"Java" → "avaJ"</li>
 *     <li>"hello" → "olleh"</li>
 *     <li>"a" → "a"</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>word는 하나 이상의 문자로 이루어져 있다.</li>
 *     <li>StringBuilder의 reverse()는 사용하지 않는다.</li>
 * </ul>
 */
public class StringReverser {

    public String solve(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            char character = word.charAt(i);

            result.append(character);
        }

        return result.toString();
    }
}
