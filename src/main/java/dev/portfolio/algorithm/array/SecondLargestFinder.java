package dev.portfolio.algorithm.array;

/**
 * 정수 배열에서 서로 다른 값 중 두 번째로 큰 수를 찾는다.
 *
 * <p>중복된 값은 하나로 취급한다.</p>
 * <ul>
 *     <li>[3, 1, 5, 2, 4] → 4</li>
 *     <li>[5, 5, 3, 1] → 3</li>
 *     <li>[-1, -3, -2] → -2</li>
 * </ul>
 *
 * <p>제한 조건: 배열 길이는 2 이상 100 이하이고, 원소는 -1,000 이상 1,000 이하이다.
 * 서로 다른 값이 최소 2개 존재한다.</p>
 */
public class SecondLargestFinder {

    public int solve(int[] numbers) {
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        // 음수만 있는 배열도 처리할 수 있도록 int의 최솟값으로 시작함
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < largest && number > secondLargest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}
