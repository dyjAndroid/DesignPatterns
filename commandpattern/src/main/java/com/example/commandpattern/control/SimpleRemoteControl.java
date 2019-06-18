package com.example.commandpattern.control;

import com.example.commandpattern.command.interf.Command;

/**
 * created by Sunday
 * on 2019-06-18 14:45
 */
public class SimpleRemoteControl {

    private Command mCommand;

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void buttonWasPressed() {
        mCommand.execute();
    }
}
