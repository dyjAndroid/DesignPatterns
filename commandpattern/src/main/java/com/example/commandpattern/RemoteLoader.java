package com.example.commandpattern;

import com.example.commandpattern.command.LightOffCommand;
import com.example.commandpattern.command.LightOnCommand;
import com.example.commandpattern.command.StereoOffCommand;
import com.example.commandpattern.command.StereoOnWithCDCommand;
import com.example.commandpattern.control.RemoteControl;
import com.example.commandpattern.device.Light;
import com.example.commandpattern.device.Stereo;

/**
 * created by Sunday
 * on 2019-06-18 16:45
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
