package ch.ennio.sileno.structural.bridge.exampleremote.abstraction;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percentage);
    int getChannel();
    void setChannel(int channel);
}
