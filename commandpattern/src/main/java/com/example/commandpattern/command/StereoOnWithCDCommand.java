package com.example.commandpattern.command;

import com.example.commandpattern.command.interf.Command;
import com.example.commandpattern.device.Stereo;

/**
 * created by Sunday
 * on 2019-06-18 16:31
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo mStereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.on();
        mStereo.setCd();
        mStereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
