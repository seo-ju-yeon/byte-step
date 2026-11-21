package dev.portfolio.algorithm.string;

/**
 * 문자열에 포함된 모음 a, e, i, o, u의 개수를 반환한다.
 *
 * <p>대문자 모음도 포함하며, 같은 모음이 반복되면 각각 센다.</p>
 * <ul>
 *     <li>"Hello" → 2</li>
 *     <li>"JAVA" → 2</li>
 *     <li>"sky" → 0</li>
 *     <li>"AEIOU" → 5</li>
 * </ul>
 *
 * <p>제한 조건: text의 길이는 1 이상 100 이하이며, 영문 대소문자로만 이루어져 있다.</p>
 */
public class VowelCounter {

    public int solve(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = Character.toLowerCase(text.charAt(i));

            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                count++;
            }
        }

        return count;
    }
}
