package dev.portfolio.algorithm.string;

import java.util.Arrays;

/**
 * 백준 10809번 '알파벳 찾기'를 메서드 형태로 푼다.
 *
 * <p>a부터 z까지 각 알파벳이 처음 등장하는 위치를 배열로 반환한다.
 * 위치는 0부터 시작하며, 문자열에 없는 알파벳의 위치는 -1이다.</p>
 *
 * <p>예시: "banana" → a는 1, b는 0, n은 2, 나머지는 -1</p>
 *
 * <p>제한 조건: text는 길이가 1 이상 100 이하인 영어 소문자 문자열이다.</p>
 */
public class AlphabetFinder {

    public int[] findPositions(String text) {
        int[] positions = new int[26];
        Arrays.fill(positions, -1);

        for (int i = 0; i < text.length(); i++) {
            // 'a'는 0, 'b'는 1, ..., 'z'는 25번 인덱스에 대응
            int alphabetIndex = text.charAt(i) - 'a';

            // 아직 기록하지 않은 알파벳일 때만 처음 등장한 위치를 저장
            if (positions[alphabetIndex] == -1) {
                positions[alphabetIndex] = i;
            }
        }

        return positions;
    }
}
