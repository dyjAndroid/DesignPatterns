package com.example.commandpattern.command;

import com.example.commandpattern.command.interf.Command;
import com.example.commandpattern.device.Light;

/**
 * created by Sunday
 * on 2019-06-18 16:24
 */
public class LightOffCommand implements Command {

    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.on();
    }
}
