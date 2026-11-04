package dev.portfolio.algorithm.string;

/**
 * 프로그래머스 '가운데 글자 가져오기'를 메서드 형태로 푼다.
 *
 * <p>문자열의 길이가 홀수이면 가운데 한 글자를,
 * 짝수이면 가운데 두 글자를 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"abcde" → "c"</li>
 *     <li>"qwer" → "we"</li>
 *     <li>"a" → "a"</li>
 * </ul>
 *
 * <p>제한 조건: text는 길이가 1 이상 100 이하인 문자열이다.</p>
 */
public class MiddleCharacterFinder {

    public String solve(String text) {
        int middle = text.length() / 2;

        // substring의 시작 인덱스는 포함하고, 끝 인덱스는 포함하지 않음
        if (text.length() % 2 == 0) {
            return text.substring(middle - 1, middle + 1);
        }

        return text.substring(middle, middle + 1);
    }
}
