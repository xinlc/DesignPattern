package org.test.command;

/**
 * 命令模式:
 * 将"请求"封装成对象,以便使用不同的请求、队列或者日志来参数化其他对象.
 * 命令模式也支持可撤销的操作。
 * Created by lichao on 2017/12/8.
 */
public class Main {
    public static void main(String[] args) {

//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        GarageDoor garageDoor = new GarageDoor();
//        LightOnCommand lightOn = new LightOnCommand(light);
//        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
//        remote.setCommand(garageOpen);
//        remote.buttonWasPressed();

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);
        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, garageOpen, garageDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("============= 执行宏命令============");
        Command[] partyOn = { lightOn, garageOpen };
        Command[] partyOff = { lightOff, garageDown };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(2, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
    }
}
