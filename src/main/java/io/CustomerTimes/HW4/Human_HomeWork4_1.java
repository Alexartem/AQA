package io.CustomerTimes;


public class Human_HomeWork4_1 {

    double weight;
    double height;
    String firstName,lastName;


    public static void main(String[] args){
        Human_HomeWork4_1 alex = new Human_HomeWork4_1();
        alex.firstName = "Alex";
        alex.lastName = "Artem";
        alex.weight = 80;
        alex.height = 187;

        System.out.println(alex.firstName +" "+ alex.lastName+" Index = " + (weightIndexCounter(alex.weight,alex.height)));

    }

    public static double weightIndexCounter(double weight, double height) {
        double index;
        index = (height-100)/weight;
        return index ;
    }

}
