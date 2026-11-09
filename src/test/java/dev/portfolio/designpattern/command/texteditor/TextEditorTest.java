package dev.portfolio.designpattern.command.texteditor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextEditorTest {

    @Test
    void 추가와_삭제를_최근_작업부터_되돌린다() {
        TextEditor editor = new TextEditor();

        editor.append("abc");
        assertEquals("abc", editor.getText());

        editor.deleteLast();
        assertEquals("ab", editor.getText());

        editor.undo();
        assertEquals("abc", editor.getText());

        editor.undo();
        assertEquals("", editor.getText());
    }

    @Test
    void 빈_문자열_추가는_기록하지_않는다() {
        TextEditor editor = new TextEditor();
        editor.append("abc");

        editor.append("");
        editor.undo();

        assertEquals("", editor.getText());
    }

    @Test
    void 빈_편집기에서_삭제한_시도는_기록하지_않는다() {
        TextEditor editor = new TextEditor();
        editor.append("a");
        editor.deleteLast(); // 실제로 'a'를 삭제
        editor.deleteLast(); // 이미 비어 있어서 변화 없음

        editor.undo();

        assertEquals("a", editor.getText());
    }

    @Test
    void 기록이_없을_때_실행_취소해도_내용은_그대로다() {
        TextEditor editor = new TextEditor();

        editor.undo();

        assertEquals("", editor.getText());
    }

}