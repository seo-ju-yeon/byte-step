package dev.portfolio.designpattern.command.texteditor;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 커맨드 패턴 연습 문제: 텍스트 편집기 실행 취소.
 *
 * <p>빈 문자열에서 시작하는 편집기를 만든다. 문자열을 추가하거나 마지막 글자를 지울 수 있고,
 * 실행 취소를 호출하면 마지막으로 내용을 바꾼 작업을 되돌린다.</p>
 *
 * <ul>
 *     <li>{@code getText()}: 현재 내용을 문자열로 반환한다.</li>
 *     <li>{@code append(String text)}: 현재 내용의 끝에 문자열을 붙인다.
 *         입력은 null이 아니며, 빈 문자열을 붙여도 내용과 작업 기록은 바뀌지 않는다.</li>
 *     <li>{@code deleteLast()}: 마지막 {@code char} 하나를 지운다.
 *         내용이 비어 있으면 내용과 작업 기록은 바뀌지 않는다.</li>
 *     <li>{@code undo()}: 가장 최근에 기록한 편집 작업을 한 번 되돌리고 기록에서 꺼낸다.
 *         기록이 비어 있으면 그대로 둔다.</li>
 * </ul>
 *
 * <p>추가와 삭제를 각각 실행과 취소를 할 수 있는 명령 객체로 구현한다.
 * 내용이 바뀐 작업만 스택에 기록하고, 실행 취소 시 가장 최근 명령부터 꺼낸다.
 * 삭제 명령은 실행할 때 지운 글자를 기억해 두었다가 취소할 때 다시 붙인다.</p>
 *
 * <p>실행 예시:</p>
 * <ol>
 *     <li>{@code append("abc")} 후 {@code "abc"}</li>
 *     <li>{@code deleteLast()} 후 {@code "ab"}</li>
 *     <li>{@code undo()} 후 {@code "abc"}</li>
 *     <li>{@code undo()} 후 {@code ""}</li>
 * </ol>
 */
public class TextEditor {

    private final StringBuilder content = new StringBuilder();
    private final Deque<EditCommand> history = new ArrayDeque<>();

    public String getText() {
        return content.toString();
    }

    public void append(String text) {
        executeCommand(new AppendTextCommand(this, text));
    }

    public void deleteLast() {
        executeCommand(new DeleteLastCharCommand(this));
    }

    public void undo() {
        if (history.isEmpty()) {
            return;
        }

        history.pop().undo();
    }

    private void executeCommand(EditCommand command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    void appendRaw(String text) {
        content.append(text);
    }

    void deleteLastRaw() {
        if (content.length() == 0) {
            return;
        }

        content.deleteCharAt(content.length() - 1);
    }
}
