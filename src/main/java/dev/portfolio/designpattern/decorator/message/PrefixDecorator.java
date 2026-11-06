package dev.portfolio.designpattern.decorator.message;

public class PrefixDecorator implements Message {

    private final Message message;

    public PrefixDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getText() {
        return "알림: " + message.getText();
    }
}
