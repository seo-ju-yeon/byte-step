package dev.portfolio.designpattern.command.texteditor;

public class AppendTextCommand implements EditCommand {

    private final TextEditor editor;
    private final String text;

    public AppendTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public boolean execute() {
        if (text.isEmpty()) {
            return false;
        }

        editor.appendRaw(text);
        return true;
    }

    @Override
    public void undo() {
        for (int i = 0; i < text.length(); i++) {
            editor.deleteLastRaw();
        }
    }
}
