package io.CustomerTimes.HW4;


public class Car extends Vehicle {


    private int gear = 0;

    public Car(){

    }

    public Car(String name, String model) {

    }

    public void Gear() {
        System.out.println(gear +" Gear ");
    }

    public void setGear(int gear) {
        this.gear = gear;
    }


    public void move(int velocity, int direction) {
        super.move(velocity, direction);
    }

    public void switchGearsUp(int gear) {
        this.gear = gear + 1;

    }

    public void switchGearsDown(int gear) {
        this.gear = gear - 1;
    }


    public static void main(String args[]) {

        Car sedan = new Car("Toyota", "Corolla");
        System.out.println(sedan.getName());
        sedan.move(10, 0);



    }


}
