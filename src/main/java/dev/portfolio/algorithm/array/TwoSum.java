package dev.portfolio.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 정수 배열에서 서로 다른 두 원소의 합이 target이 되는 인덱스를 반환한다.
 * 같은 원소는 두 번 사용할 수 없으며, 정답은 하나만 존재한다.
 * 인덱스는 0부터 시작하고 작은 인덱스를 먼저 반환한다.
 */
public class TwoSum {

    public int[] solve(int[] numbers, int target) {
        // 이전에 확인한 숫자를 다시 순회하지 않도록 숫자와 인덱스를 저장한다.
        // 숫자를 key, 인덱스를 value로 저장하고 빠르게 찾기 위해 HashMap을 사용한다.
        Map<Integer, Integer> indexesByNumber = new HashMap<>();

        for (int index = 0; index < numbers.length; index++) {
            // 현재 숫자와 더했을 때 target이 되는 숫자를 구한다.
            int requiredNumber = target - numbers[index];

            // 필요한 숫자를 이미 확인했다면 이전 인덱스와 현재 인덱스가 정답이다.
            if (indexesByNumber.containsKey(requiredNumber)) {
                return new int[]{indexesByNumber.get(requiredNumber), index};
            }

            // 같은 숫자가 여러 번 나오더라도 처음 등장한 인덱스를 유지한다.
            indexesByNumber.putIfAbsent(numbers[index], index);
        }

        throw new IllegalArgumentException("합이 target이 되는 두 원소가 없습니다.");
    }
}
