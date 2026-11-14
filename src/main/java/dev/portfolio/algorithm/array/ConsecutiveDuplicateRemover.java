package dev.portfolio.algorithm.array;

import java.util.Arrays;

/**
 * 연속해서 같은 숫자가 나오면 하나만 남긴 새 배열을 반환한다.
 *
 * <p>떨어져 있는 같은 숫자는 유지하며, 원소의 순서와 원본 배열은 변경하지 않는다.</p>
 * <ul>
 *     <li>[1, 1, 3, 3, 0, 1, 1] → [1, 3, 0, 1]</li>
 *     <li>[4, 4, 4, 3, 3] → [4, 3]</li>
 *     <li>[1, 2, 1] → [1, 2, 1]</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 1 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.</p>
 */
public class ConsecutiveDuplicateRemover {

    public int[] solve(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[0];
        int count = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                result[count] = numbers[i];
                count++;
            }
        }

        // 실제로 채운 부분만 복사해 결과 길이를 맞춤
        return Arrays.copyOf(result, count);
    }
}
