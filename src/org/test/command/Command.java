package org.test.command;

/**
 * Created by lichao on 2017/12/8.
 */
public interface Command {
    public void execute();
    public void undo();
}
