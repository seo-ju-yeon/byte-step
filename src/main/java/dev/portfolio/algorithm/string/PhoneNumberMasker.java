package dev.portfolio.algorithm.string;

/**
 * 프로그래머스 '핸드폰 번호 가리기'를 메서드 형태로 푼다.
 *
 * <p>전화번호의 뒤 4자리를 제외한 나머지 숫자를 모두 '*'로 바꿔 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>"01033334444" → "*******4444"</li>
 *     <li>"027778888" → "*****8888"</li>
 *     <li>"1234" → "1234"</li>
 * </ul>
 *
 * <p>제한 조건: phoneNumber는 길이가 4 이상 20 이하인 숫자 문자열이다.</p>
 */
public class PhoneNumberMasker {

    public String solve(String phoneNumber) {
        int maskLength = phoneNumber.length() - 4;
        StringBuilder result = new StringBuilder();

        // 뒤 4자리를 제외한 글자 수만큼 '*'을 추가한다.
        for (int i = 0; i < maskLength; i++) {
            result.append('*');
        }

        // substring은 지정한 인덱스부터 끝까지의 문자열을 가져온다.
        result.append(phoneNumber.substring(maskLength));

        return result.toString();
    }
}
