package dev.portfolio.algorithm.array;

/**
 * 세 자연수 a, b, c를 곱한 결과에 0부터 9까지의 숫자가 각각 몇 번 등장하는지 구한다.
 *
 * <p>반환 배열의 인덱스는 숫자를 의미한다.
 * 예를 들어 result[0]은 숫자 0의 등장 횟수이고,
 * result[9]는 숫자 9의 등장 횟수이다.</p>
 *
 * <p>제한 조건: a, b, c는 각각 100 이상 1,000 이하이다.</p>
 */
public class DigitCounter {

    public int[] solve(int a, int b, int c) {
        int product = a * b * c;
        int[] counts = new int[10];

        while (product > 0) {
            int digit = product % 10;  // 마지막 자리 숫자 추출
            counts[digit]++;           // 추출한 숫자의 개수 증가
            product = product / 10;    // 마지막 자리 제거
        }
        return counts;
    }
}
