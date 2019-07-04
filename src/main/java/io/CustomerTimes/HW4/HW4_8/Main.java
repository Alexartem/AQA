package io.CustomerTimes.HW4.HW4_8;

public class Main {

    public static void main (String[] args) {


        TVDevice tvDevice = new TV();
        RemoteController remoteController = new RemoteController();
        remoteController.connectToDevice(new TV());
        remoteController.setChannel(5);
        remoteController.currentChannel();




    }
}
