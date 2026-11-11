package dev.portfolio.algorithm.math;

/**
 * 1부터 n까지의 정수를 FizzBuzz 규칙으로 변환한 문자열 배열을 반환한다.
 *
 * <ul>
 *     <li>3과 5의 공배수: "FizzBuzz"</li>
 *     <li>3의 배수: "Fizz"</li>
 *     <li>5의 배수: "Buzz"</li>
 *     <li>나머지: 숫자의 문자열 표현</li>
 * </ul>
 *
 * <p>예시: 5 → ["1", "2", "Fizz", "4", "Buzz"]</p>
 * <p>제한 조건: n은 1 이상 100 이하의 정수이다.</p>
 */
public class FizzBuzz {

    public String[] solve(int n) {
        String[] result = new String[n];

        for (int number = 1; number <= n; number++) {
            // 공배수를 먼저 확인해야 15 등이 Fizz나 Buzz로 처리되지 않음
            if (number % 15 == 0) {
                result[number - 1] = "FizzBuzz";
            } else if (number % 3 == 0) {
                result[number - 1] = "Fizz";
            } else if (number % 5 == 0) {
                result[number - 1] = "Buzz";
            } else {
                result[number - 1] = String.valueOf(number);
            }
        }

        return result;
    }
}
