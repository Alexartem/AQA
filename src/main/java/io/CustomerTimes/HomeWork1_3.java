package io.CustomerTimes;
import java.util.Scanner;


public class HomeWork1_3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        float a,b;
        float s;
        System.out.println("Enter width > 0 ");
        a = num.nextFloat();

        if (a <= 0) {
            System.out.println("Incorrect number");
        }
        else {
            System.out.println("Enter height > 0");
            b = num.nextFloat();
            if (b <= 0) {
                System.out.println("Incorrect number");
            } else {
                s = a * b;
                System.out.println("Square = " + s);
            }
        }
    }
}
