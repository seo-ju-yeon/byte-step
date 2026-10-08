package dev.portfolio.algorithm.string;

/**
 * 백준 1152번 '단어의 개수'를 메서드 형태로 푼다.
 *
 * <p>문장에 들어 있는 단어의 개수를 반환한다. 단어는 공백으로 구분하며,
 * 문장의 맨 앞이나 맨 뒤에도 공백이 있을 수 있다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"Java is fun" → 3</li>
 *     <li>" Hello world " → 2</li>
 *     <li>"Word" → 1</li>
 * </ul>
 *
 * <p>제한 조건: sentence는 영어 대소문자와 공백으로 이루어져 있다.</p>
 */
public class WordCounter {

    public int solve(String sentence) {

        String text = sentence.trim();  // 앞뒤 공백 제거

        if (text.isEmpty()) {
            return 0;
        }

        // 공백을 기준으로 단어 나누기
        String[] words = text.split(" ");
        return words.length;
    }
}
