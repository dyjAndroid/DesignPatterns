package com.example.commandpattern.command;

import com.example.commandpattern.command.interf.Command;

/**
 * created by Sunday
 * on 2019-06-18 15:51
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no execute...");
    }

    @Override
    public void undo() {

    }
}
