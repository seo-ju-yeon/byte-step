package dev.portfolio.designpattern.command.texteditor;

public class DeleteLastCharCommand implements EditCommand {

    private final TextEditor editor;
    private char deletedChar;

    public DeleteLastCharCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public boolean execute() {
        String currentText = editor.getText();

        if (currentText.isEmpty()) {
            return false;
        }

        deletedChar = currentText.charAt(currentText.length() - 1);
        editor.deleteLastRaw();
        return true;
    }

    @Override
    public void undo() {
        editor.appendRaw(String.valueOf(deletedChar));
    }
}
