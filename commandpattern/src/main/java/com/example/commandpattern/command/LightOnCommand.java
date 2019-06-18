package com.example.commandpattern.command;


import com.example.commandpattern.command.interf.Command;
import com.example.commandpattern.device.Light;

/**
 * created by Sunday
 * on 2019-06-18 14:38
 */
public class LightOnCommand implements Command {

    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
