package io.CustomerTimes;

public class BoxerHomeWork4_2 {
    public int age;
    public int weight;
    public int strength;


    public BoxerHomeWork4_2(int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;

    }

    public boolean fight(BoxerHomeWork4_2 anotherBoxer){

        if (((100-this.age)*this.weight*this.strength)>((100-anotherBoxer.age)*anotherBoxer.weight*anotherBoxer.strength)){
            return true;
        } else return false;


    }


    public static void main(String[] args) {

        BoxerHomeWork4_2 usik = new BoxerHomeWork4_2(25,90,100);
        BoxerHomeWork4_2 klitchko = new BoxerHomeWork4_2(45,100,100);
        System.out.println(usik.fight(klitchko));
        System.out.println(klitchko.fight(usik));

    }




}
