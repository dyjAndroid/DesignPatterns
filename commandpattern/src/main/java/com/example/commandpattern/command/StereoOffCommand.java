package com.example.commandpattern.command;

import com.example.commandpattern.command.interf.Command;
import com.example.commandpattern.device.Stereo;

/**
 * created by Sunday
 * on 2019-06-18 16:33
 */
public class StereoOffCommand implements Command {

    private Stereo mStereo;

    public StereoOffCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.off();
    }

    @Override
    public void undo() {

    }
}
