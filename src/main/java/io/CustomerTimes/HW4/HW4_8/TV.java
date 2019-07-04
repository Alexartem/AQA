package io.CustomerTimes.HW4.HW4_8;

public class TV extends TVDevice {

    private int volumeLevel = 0;

    private int channelNumber = 1;

    @Override
    public void powerOn() {
        super.isOn = true;
    }

    @Override
    public void powerOff() {
        super.isOn = false;
    }

    @Override
    public void setChannel(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    @Override
    public void currentChannel() {
        System.out.println(channelNumber);
    }

    @Override
    public void upVolume() {
        this.volumeLevel++;
    }

    @Override
    public void downVolume() {
        this.volumeLevel--;
    }

    @Override
    public void mute() {
        this.volumeLevel = 0;
    }
}
