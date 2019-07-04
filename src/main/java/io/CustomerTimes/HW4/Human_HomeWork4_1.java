package io.CustomerTimes.HW4;


public class Human_HomeWork4_1 {

    private double weight;
    private double height;
    private String firstName,lastName;

    public Human_HomeWork4_1(double weight, double height, String firstName, String lastName) {
        this.weight = weight;
        this.height = height;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args){
        Human_HomeWork4_1 alex = new Human_HomeWork4_1(85,187,"Alex", "Artem");

        System.out.println(alex.firstName +" "+ alex.lastName+" Index = " + (weightIndexCounter(alex.weight,alex.height)));

    }




    public static double weightIndexCounter(double weight, double height) {
        double index;
        index = (height-100)/weight;
        return index ;
    }

}
