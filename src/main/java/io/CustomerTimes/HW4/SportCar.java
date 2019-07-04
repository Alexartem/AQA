package io.CustomerTimes.HW4;

public class SportCar extends Car {

    private boolean nitro;
    private int gear;
    int extraAcceleration = 30;

    public SportCar(){

    }
    public SportCar(String name, int size, boolean nitro){

    }


    @Override
    public void setGear(int gear) {
        this.gear = gear;
    }


    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }


    public int getGear() {
        return gear;
    }


    @Override
    public void steer(int direction) {
        int extraSteer = 20;
        setCurrentDirection(direction + extraSteer);
        System.out.println(getCurrentDirection());


    }

    @Override
    public  void move(int velocity, int direction) {
        if (nitro = true) {
            super.move(velocity + extraAcceleration, direction);
        }
        else super.move(velocity, direction);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public static void main(String[] args) {
        SportCar audi = new SportCar("R80",5,true);
        audi.steer(100); audi.switchGearsUp(2);audi.setNitro(true);audi.move(30,50);
        System.out.println(audi.getCurrentVelocity());
        audi.getGear();

        audi.getName();
    }




}
