package ch.ennio.sileno.structural.bridge.exampleremote.abstraction;

public class Radio implements Device {
    private boolean isEnabled = false;
    private int channel = 0;
    private int volume = 0;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
    }

    @Override
    public void disable() {
        isEnabled = false;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percentage) {
        volume = percentage;
    }
}
