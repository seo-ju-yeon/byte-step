package dev.portfolio.algorithm.array;

import java.util.Arrays;

/**
 * 이미 오름차순으로 정렬된 두 배열을 합쳐 중복 없는 오름차순 배열로 반환한다.
 *
 * <p>예시:</p>
 * <ul>
 *     <li>first = [1, 2, 2], second = [2, 3, 3] → [1, 2, 3]</li>
 *     <li>first = [-1, 0], second = [-1, 1] → [-1, 0, 1]</li>
 * </ul>
 *
 * <p>first와 second는 각각 하나 이상의 정수를 포함하며 이미 오름차순으로 정렬되어 있다.</p>
 */
public class SortedArrayUniqueMerger {

    public int[] solve(int[] first, int[] second) {

        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;
        int[] result = new int[first.length + second.length];

        // 두 배열의 현재 값을 비교해 작은 값을 결과에 넣음
        while (firstIndex < first.length && secondIndex < second.length) {
            int next;

            if (first[firstIndex] <= second[secondIndex]) {
                next = first[firstIndex];
                firstIndex++;
            } else {
                next = second[secondIndex];
                secondIndex++;
            }

            // 첫 값을 무조건 넣기위해 resultIndex == 0 사용
            // 마지막으로 넣은 값을 비교하기 위해 result[resultIndex - 1] 사용
            if (resultIndex == 0 || result[resultIndex - 1] != next) {
                result[resultIndex] = next;
                resultIndex++;
            }
        }

        // first에 남은 값을 넣음
        while (firstIndex < first.length) {
            int next = first[firstIndex];
            firstIndex++;

            if (resultIndex == 0 || result[resultIndex - 1] != next) {
                result[resultIndex] = next;
                resultIndex++;
            }
        }

        // second에 남은 값을 넣음
        while (secondIndex < second.length) {
            int next = second[secondIndex];
            secondIndex++;

            if (resultIndex == 0 || result[resultIndex - 1] != next) {
                result[resultIndex] = next;
                resultIndex++;
            }
        }

        // 중복 제거 후 실제로 채운 부분만 새 배열로 복사해 반환함
        // resultIndex가 결과에 들어간 숫자의 개수
        return Arrays.copyOf(result, resultIndex);
    }
}
