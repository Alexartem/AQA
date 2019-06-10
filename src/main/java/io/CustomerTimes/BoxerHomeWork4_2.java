package io.CustomerTimes;

public class Boxer {
    public int age;
    public int weight;
    public int strength;


    public Boxer(int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;

    }

    public boolean fight(Boxer anotherBoxer){

        if (((100-this.age)*this.weight*this.strength)>((100-anotherBoxer.age)*anotherBoxer.weight*anotherBoxer.strength)){
            return true;
        } else return false;


    }


    public static void main(String[] args) {

        Boxer usik = new Boxer(25,90,100);
        Boxer klitchko = new Boxer(45,100,100);
        System.out.println(usik.fight(klitchko));
        System.out.println(klitchko.fight(usik));


    }




}
