package ch.ennio.sileno.structural.bridge.exampleremote.implementation;

import ch.ennio.sileno.structural.bridge.exampleremote.abstraction.Device;

public class RemoteControl {

    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        if(device.getVolume() < 10) {
            device.setVolume(0);
        } else {
            device.setVolume(device.getVolume() - 10);
        }
    }

    public void volumeUp() {
        if(device.getVolume() >= 90) {
            device.setVolume(device.getVolume() + 10);
        } else {
            device.setVolume(100);
        }
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
