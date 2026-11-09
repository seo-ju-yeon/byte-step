package dev.portfolio.designpattern.strategy.stringvalidation;

/**
 * 전략 패턴 연습 문제: 문자열 다루기 기본.
 *
 * <p>문자열의 길이가 4 또는 6이고, 모든 문자가 '0'부터 '9' 사이의 숫자일 때만
 * {@code true}를 반환하는 검사기를 만든다.</p>
 *
 * <ul>
 *     <li>{@code StringValidationStrategy}: 검사 규칙 하나의 통과 여부를 반환한다.</li>
 *     <li>{@code AllowedLengthStrategy}: 길이가 4 또는 6인지 확인한다.</li>
 *     <li>{@code DigitsOnlyStrategy}: 모든 문자가 숫자인지 확인한다.</li>
 *     <li>{@code StringValidator}: 전달받은 검사 전략을 모두 통과하면 {@code true}를 반환한다.</li>
 * </ul>
 *
 * <p>입력은 길이 1 이상 8 이하이며, 영문 대소문자와 숫자로 이루어져 있다.</p>
 * <p>예시: {@code "1234"}와 {@code "123456"}은 통과한다.
 * {@code "a234"}는 숫자 검사에서, {@code "12345"}는 길이 검사에서 실패한다.</p>
 *
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12918">프로그래머스 문자열 다루기 기본</a>
 */
public interface StringValidationStrategy {

    boolean isValid(String text);
}
