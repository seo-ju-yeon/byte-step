package dev.portfolio.algorithm.array;

/**
 * 정수 배열의 원소 순서를 반대로 뒤집은 새 배열을 반환한다.
 *
 * <p>원본 배열은 변경하지 않으며, 빈 배열이 주어지면 새 빈 배열을 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[1, 2, 3, 4] → [4, 3, 2, 1]</li>
 *     <li>[7] → [7]</li>
 *     <li>[] → []</li>
 * </ul>
 *
 * <p>제한 조건: numbers는 null이 아니다.</p>
 */
public class ArrayReverser {

    public int[] solve(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }

        return result;
    }
}
