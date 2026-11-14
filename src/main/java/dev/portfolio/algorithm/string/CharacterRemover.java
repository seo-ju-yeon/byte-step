package dev.portfolio.algorithm.string;

/**
 * 문자열에서 지정한 문자를 모두 제거한 문자열을 반환한다.
 *
 * <p>대문자와 소문자는 구분하며, 남은 문자의 순서는 유지한다.</p>
 * <ul>
 *     <li>"banana", 'a' → "bnn"</li>
 *     <li>"Hello", 'l' → "Heo"</li>
 *     <li>"Java", 'x' → "Java"</li>
 *     <li>"aaa", 'a' → ""</li>
 * </ul>
 *
 * <p>제한 조건: text의 길이는 1 이상 100 이하이며,
 * text와 target은 영문 대소문자로 이루어져 있다.</p>
 */
public class CharacterRemover {

    public String solve(String text, char target) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character != target) {
                result.append(character);
            }
        }

        return result.toString();
    }
}
