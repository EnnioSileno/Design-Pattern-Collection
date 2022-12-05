package ch.ennio.sileno.structural.bridge.exampleremote;

import ch.ennio.sileno.structural.bridge.exampleremote.abstraction.Device;
import ch.ennio.sileno.structural.bridge.exampleremote.abstraction.TV;
import ch.ennio.sileno.structural.bridge.exampleremote.implementation.RemoteControl;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
    }
}
