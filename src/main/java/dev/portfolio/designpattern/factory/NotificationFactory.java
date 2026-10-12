package dev.portfolio.designpattern.factory;

/**
 * 알림 종류에 따라 알맞은 객체를 만드는 간단한 팩토리를 구현한다.
 *
 * <p>이 문제에서는 알림을 실제로 전송하지 않고, 전송 결과를 문자열로 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>EMAIL 알림에 "안녕하세요"를 전달하면 "이메일: 안녕하세요"를 반환한다.</li>
 *     <li>SMS 알림에 "안녕하세요"를 전달하면 "문자: 안녕하세요"를 반환한다.</li>
 * </ul>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>{@code Notification} 인터페이스에 문자열을 반환하는 {@code send(String message)} 메서드를 선언한다.</li>
 *     <li>{@code EmailNotification}과 {@code SmsNotification}이 이 인터페이스를 구현한다.</li>
 *     <li>{@code create(String type)}은 "EMAIL"이면 이메일 알림 객체를, "SMS"이면 문자 알림 객체를 반환한다.</li>
 *     <li>알 수 없는 알림 종류가 전달되면 {@code IllegalArgumentException}을 던진다.</li>
 * </ul>
 *
 * <p>제한 조건: 알림 종류는 대문자 "EMAIL", "SMS" 또는 그 외 문자열이며,
 * 메시지는 null이 아닌 문자열이다.</p>
 */
public class NotificationFactory {

    public Notification create(String type) {
        if ("EMAIL".equals(type)) {
            return new EmailNotification();
        } else if ("SMS".equals(type)) {
            return new SmsNotification();
        } else {
            throw new IllegalArgumentException("알 수 없는 알림 종류: " + type);
        }
    }
}
