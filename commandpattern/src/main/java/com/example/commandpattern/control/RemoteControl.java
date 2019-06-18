package com.example.commandpattern.control;

import com.example.commandpattern.command.NoCommand;
import com.example.commandpattern.command.interf.Command;

/**
 * created by Sunday
 * on 2019-06-18 15:49
 */
public class RemoteControl {

    private Command[] mOnCommands;
    private Command[] mOffCommands;
    private Command mUndoCommand;

    public RemoteControl() {
        mOnCommands = new Command[7];
        mOffCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            mOnCommands[i] = noCommand;
            mOffCommands[i] = noCommand;
        }
        mUndoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        mOnCommands[slot] = onCommand;
        mOffCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        mOnCommands[slot].execute();
        mUndoCommand = mOnCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        mOffCommands[slot].execute();
        mUndoCommand = mOffCommands[slot];
    }

    public void undoButtonWasPushed() {
        mUndoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < mOnCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + mOnCommands[i].getClass().getName() +
                    "   " + mOffCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
