package io.CustomerTimes.HW4.HW4_8;

public class RemoteController implements Volume, Device {

    private Device device;


    public void connectToDevice(Device device) {
        this.device = device;
    }

    public RemoteController() {
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void switchTheChannel(int newChannel) {
        device.setChannel(newChannel);

    }

    @Override
    public void currentChannel() {
        device.currentChannel();

    }

    @Override
    public void upVolume() {
        if (device instanceof Volume) {
           ((Volume) device).upVolume();
        }
        System.out.println("This device doesn't support volume.");
    }

    @Override
    public void downVolume() {
        if (device instanceof Volume) {
            ((Volume) device).downVolume();
        }
        System.out.println("This device doesn't support volume.");
    }

    @Override
    public void mute() {
        if (device instanceof Volume) {
            ((Volume) device).mute();
        }
        System.out.println("This device doesn't support volume.");

    }


    public void disconnectDevice() {
        this.device = null;
    }

    private boolean checkIfDeviceConnected() {

        return device != null;
    }


}
