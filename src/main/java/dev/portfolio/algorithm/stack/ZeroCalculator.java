package dev.portfolio.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 입력된 정수를 순서대로 처리한 뒤 남아 있는 숫자의 합을 구한다.
 *
 * <p>0이 아닌 숫자는 저장하고, 0이 나오면 가장 최근에 저장한 숫자를 삭제한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>[3, 0, 4, 2, 0] → 4</li>
 *     <li>[1, 2, 0, 3] → 4</li>
 *     <li>[5, 0] → 0</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>numbers에는 0 이상의 정수만 들어 있다.</li>
 *     <li>0이 입력될 때는 삭제할 숫자가 하나 이상 존재한다.</li>
 * </ul>
 */
public class ZeroCalculator {

    public int solve(int[] numbers) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int number : numbers) {
            if (number == 0) {
                // 가장 최근 숫자 삭제
                // pop: 가장 최근에 저장한 숫자를 꺼내면서 삭제
                stack.pop();
            } else {
                // 새로운 숫자 저장
                // push: 숫자를 가장 위에 저장
                stack.push(number);
            }
        }

        int sum = 0;

        for (int number : stack) {
            sum += number;
        }

        return sum;
    }
}
