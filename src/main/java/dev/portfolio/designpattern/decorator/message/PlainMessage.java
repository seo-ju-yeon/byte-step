package dev.portfolio.designpattern.decorator.message;

public class PlainMessage implements Message {

    private final String text;

    public PlainMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
