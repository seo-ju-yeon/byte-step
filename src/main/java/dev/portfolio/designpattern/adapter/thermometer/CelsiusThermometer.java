package dev.portfolio.designpattern.adapter.thermometer;

/**
 * 어댑터 패턴 연습 문제: 화씨 온도계를 섭씨 온도계처럼 사용하기.
 *
 * <p>문제: 기존 온도계는 getFahrenheit()로 화씨 온도만 제공한다.
 * 새 프로그램은 CelsiusThermometer의 getCelsius()로 섭씨 온도를 조회해야 한다.
 * 기존 온도계의 기능을 바꾸지 않고, 어댑터를 만들어 두 타입을 연결한다.</p>
 *
 * <p>만들어야 할 타입:</p>
 * <ul>
 *     <li>{@code CelsiusThermometer}: {@code double getCelsius()}를 선언하는 인터페이스.</li>
 *     <li>{@code FahrenheitThermometer}: 생성자로 받은 화씨 온도를 저장하고,
 *         {@code double getFahrenheit()}로 그대로 반환하는 기존 온도계 역할의 클래스.</li>
 *     <li>{@code FahrenheitAdapter}: {@code CelsiusThermometer}를 구현하고,
 *         기존 온도계의 화씨 값을 섭씨로 변환해 반환하는 클래스.</li>
 * </ul>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>FahrenheitThermometer는 CelsiusThermometer를 구현하지 않는다.
 *         이 클래스에는 화씨 값을 저장하고 조회하는 기능만 작성한다.</li>
 *     <li>FahrenheitAdapter는 생성자로 FahrenheitThermometer 객체를 받아 보관한다.</li>
 *     <li>어댑터의 getCelsius()는 보관한 온도계의 getFahrenheit()를 호출하고,
 *         그 결과를 섭씨로 변환해 반환한다.</li>
 *     <li>섭씨 변환 공식은 {@code (fahrenheit - 32) * 5.0 / 9.0}이다.
 *         계산 결과를 정수로 바꾸거나 별도로 반올림하지 않는다.</li>
 *     <li>새 프로그램에서는 어댑터를 CelsiusThermometer 타입의 변수에 담아 사용한다.</li>
 *     <li>온도를 변환해도 기존 온도계에 저장된 화씨 값은 변경하지 않는다.</li>
 * </ul>
 *
 * <p>입출력 예시 (화씨 → 섭씨):</p>
 * <ul>
 *     <li>32.0 → 0.0</li>
 *     <li>212.0 → 100.0</li>
 *     <li>77.0 → 25.0</li>
 *     <li>-40.0 → -40.0</li>
 * </ul>
 *
 * <p>제한 조건: 화씨 입력은 유한한 실수이며, 어댑터에 전달하는 온도계는 null이 아니다.</p>
 *
 * <p>테스트 목표: 기본 온도계가 입력값을 그대로 반환하는지, 위 예시대로 변환되는지,
 * 변환 후에도 원래 화씨 값이 유지되는지 JUnit으로 확인한다.
 * double 결과 비교에는 {@code assertEquals(expected, actual, 0.000001)}처럼
 * 허용 오차를 지정한다.</p>
 */
public interface CelsiusThermometer {

    // Celsius: 섭씨
    double getCelsius();
}
