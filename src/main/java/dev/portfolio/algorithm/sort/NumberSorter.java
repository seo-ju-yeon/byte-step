package dev.portfolio.algorithm.sort;

/**
 * 백준 2750번 '수 정렬하기'를 메서드 형태로 푼다.
 *
 * <p>주어진 정수를 작은 수부터 큰 수까지 오름차순으로 정렬한 배열을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[5, 2, 3, 4, 1] → [1, 2, 3, 4, 5]</li>
 *     <li>[3, -1, 0] → [-1, 0, 3]</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>numbers에는 하나 이상의 정수가 들어 있다.</li>
 *     <li>같은 수는 두 번 나오지 않는다.</li>
 * </ul>
 */
public class NumberSorter {

    public int[] solve(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        return numbers;
    }
}
