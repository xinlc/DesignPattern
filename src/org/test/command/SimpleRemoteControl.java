package org.test.command;

/**
 * 简单遥控器
 * Created by lichao on 2017/12/8.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
