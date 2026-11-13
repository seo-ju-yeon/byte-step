package dev.portfolio.algorithm.array;

/**
 * 배열의 0을 모두 뒤로 이동한 새 배열을 반환한다.
 *
 * <p>0이 아닌 원소의 순서는 유지하며, 원본 배열은 변경하지 않는다.</p>
 * <ul>
 *     <li>[0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]</li>
 *     <li>[0, 0, 5] → [5, 0, 0]</li>
 *     <li>[1, 2, 3] → [1, 2, 3]</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 1 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.</p>
 */
public class ZeroMover {

    public int[] solve(int[] numbers) {
        // 새 int 배열은 모든 원소가 0이므로, 0이 아닌 값만 앞에서부터 채움
        int[] result = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number != 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }
}
