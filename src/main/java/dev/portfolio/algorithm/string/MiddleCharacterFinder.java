package dev.portfolio.algorithm.string;

/**
 * 프로그래머스 '가운데 글자 가져오기' 복습 문제와 완성 풀이.
 *
 * <p>문제: 문자열 text를 받아 가운데 글자를 반환한다.
 * 길이가 홀수이면 한 글자를, 짝수이면 두 글자를 반환한다.</p>
 * <p>문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12903</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"abcde" → "c"</li>
 *     <li>"qwer" → "we"</li>
 *     <li>"a" → "a"</li>
 *     <li>"ab" → "ab"</li>
 *     <li>"abcdef" → "cd"</li>
 * </ul>
 *
 * <p>제한 조건: text는 길이가 1 이상 100 이하인 문자열이다.</p>
 */
public class MiddleCharacterFinder {

    /**
     * @param text 길이가 1 이상 100 이하인 문자열
     * @return 가운데 한 글자 또는 두 글자
     */
    public String solve(String text) {
        // 정수끼리 나누면 소수점 아래는 버림 예: 5 / 2 = 2, 6 / 2 = 3
        int middle = text.length() / 2;

        // substring(start, end)는 start를 포함하고 end는 포함하지 않음
        if (text.length() % 2 == 0) {
            // 짝수 길이: 가운데 오른쪽 위치가 middle이므로 왼쪽 글자도 포함함
            // "abcdef"는 middle이 3 → substring(2, 4) → "cd"
            return text.substring(middle - 1, middle + 1);
        }

        // 홀수 길이: middle 위치의 한 글자만 가져온다.
        // "abcde"는 middle이 2 → substring(2, 3) → "c"
        return text.substring(middle, middle + 1);
    }
}
