package dev.portfolio.designpattern.decorator.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void 기본_메시지는_원문을_그대로_반환한다() {
        Message message = new PlainMessage("안녕하세요");

        assertEquals("안녕하세요", message.getText());
    }

    @Test
    void 메시지_앞에_알림_문구를_추가한다() {
        Message original = new PlainMessage("안녕하세요");
        Message notification = new PrefixDecorator(original);

        assertEquals("알림: 안녕하세요", notification.getText());
    }

    @Test
    void 메시지_전체를_대괄호로_감싼다() {
        Message original = new PlainMessage("안녕하세요");
        Message bracket = new BracketDecorator(original);

        assertEquals("[안녕하세요]", bracket.getText());
    }

    @Test
    void 알림_문구를_추가한_메시지_전체를_대괄호로_감싼다() {
        Message original = new PlainMessage("안녕하세요");
        Message notification = new PrefixDecorator(original);
        Message bracket = new BracketDecorator(notification);

        assertEquals("[알림: 안녕하세요]", bracket.getText());
    }

    @Test
    void 대괄호로_감싼_메시지_앞에_알림_문구를_추가한다() {
        Message original = new PlainMessage("안녕하세요");
        Message bracket = new BracketDecorator(original);
        Message notification = new PrefixDecorator(bracket);

        assertEquals("알림: [안녕하세요]", notification.getText());
    }

    @Test
    void 대괄호를_두번_적용하면_중첩해서_감싼다() {
        Message original = new PlainMessage("안녕하세요");
        Message bracket = new BracketDecorator(original);
        Message doubleBracket = new BracketDecorator(bracket);

        assertEquals("[[안녕하세요]]", doubleBracket.getText());
    }

}