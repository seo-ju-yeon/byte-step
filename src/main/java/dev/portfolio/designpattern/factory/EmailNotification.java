package dev.portfolio.designpattern.factory;

public class EmailNotification implements Notification {

    @Override
    public String send(String message) {
        return "이메일: " + message;
    }

}
