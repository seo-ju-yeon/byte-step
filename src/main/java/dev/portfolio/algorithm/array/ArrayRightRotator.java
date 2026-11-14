package dev.portfolio.algorithm.array;

/**
 * 배열을 오른쪽으로 한 칸 회전한 새 배열을 반환한다.
 *
 * <p>마지막 원소를 맨 앞으로 옮기고, 나머지 원소는 한 칸씩 뒤로 이동한다.
 * 원본 배열은 변경하지 않는다.</p>
 * <ul>
 *     <li>[1, 2, 3, 4] → [4, 1, 2, 3]</li>
 *     <li>[5, 5, 0] → [0, 5, 5]</li>
 *     <li>[7] → [7]</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 1 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.</p>
 */
public class ArrayRightRotator {

    public int[] solve(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            result[i + 1] = numbers[i];
        }

        return result;
    }
}
