package dev.portfolio.designpattern.factory;

public class SmsNotification implements Notification {

    @Override
    public String send(String message) {
        return "문자: " + message;
    }

}
