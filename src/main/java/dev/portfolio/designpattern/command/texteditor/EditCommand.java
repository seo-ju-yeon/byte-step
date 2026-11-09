package dev.portfolio.designpattern.command.texteditor;

public interface EditCommand {

    boolean execute();

    void undo();
}
