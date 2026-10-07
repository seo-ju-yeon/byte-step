package dev.portfolio.algorithm.array;

/**
 * 백준 11728번 '배열 합치기'를 메서드 형태로 푼다.
 *
 * <p>이미 오름차순으로 정렬된 두 배열을 합쳐 하나의 오름차순 배열로 반환한다.
 * 같은 숫자가 여러 번 나오면 그 횟수만큼 결과에 포함한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>first = [1, 4, 7], second = [2, 3, 8] → [1, 2, 3, 4, 7, 8]</li>
 *     <li>first = [1, 2], second = [2, 2] → [1, 2, 2, 2]</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>first와 second에는 각각 하나 이상의 정수가 들어 있다.</li>
 *     <li>두 배열은 이미 오름차순으로 정렬되어 있다.</li>
 *     <li>결과 배열의 길이는 두 배열의 길이를 합한 값이다.</li>
 * </ul>
 */
public class SortedArrayMerger {

    public int[] solve(int[] first, int[] second) {

        int firstIndex = 0;
        int secondIndex = 0;
        int resultIndex = 0;
        // new int[크기]: 모든 원소를 담을 결과 배열을 만듦
        int[] result = new int[first.length + second.length];

        // 두 배열의 현재 값을 비교해 작은 값을 결과에 넣음
        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] <= second[secondIndex]) {
                result[resultIndex] = first[firstIndex];
                firstIndex++;
            } else {
                result[resultIndex] = second[secondIndex];
                secondIndex++;
            }
            resultIndex++;
        }

        // first에 남은 값을 넣음
        while (firstIndex < first.length) {
            result[resultIndex] = first[firstIndex];
            firstIndex++;
            resultIndex++;
        }

        // second에 남은 값을 넣음
        while (secondIndex < second.length) {
            result[resultIndex] = second[secondIndex];
            secondIndex++;
            resultIndex++;
        }

        return result;
    }
}
