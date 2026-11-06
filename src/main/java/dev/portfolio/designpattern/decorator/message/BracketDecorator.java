package dev.portfolio.designpattern.decorator.message;

public class BracketDecorator implements Message {

    private final Message message;

    public BracketDecorator(Message message) {
        this.message = message;
    }


    @Override
    public String getText() {
        return "[" + message.getText() + "]";
    }
}
