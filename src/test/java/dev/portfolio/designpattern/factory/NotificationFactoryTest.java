package dev.portfolio.designpattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    private final NotificationFactory notificationFactory = new NotificationFactory();

    @Test
    void 이메일_알림을_만든다() {
        Notification notification = notificationFactory.create("EMAIL");
        assertEquals("이메일: 안녕하세요", notification.send("안녕하세요"));
    }

    @Test
    void 문자_알림을_만든다() {
        Notification notification = notificationFactory.create("SMS");
        assertEquals("문자: 안녕하세요", notification.send("안녕하세요"));
    }

    @Test
    void 알_수_없는_종류면_예외가_발생한다() {
        assertThrows(
                IllegalArgumentException.class,
                () -> notificationFactory.create("PUSH")
        );
    }

}