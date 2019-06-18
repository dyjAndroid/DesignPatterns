package com.example.commandpattern;

import com.example.commandpattern.command.LightOnCommand;
import com.example.commandpattern.control.SimpleRemoteControl;
import com.example.commandpattern.device.Light;

/**
 * created by Sunday
 * on 2019-06-18 14:47
 * 命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 */
public class Test {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(new LightOnCommand(new Light()));
        control.buttonWasPressed();
    }
}
