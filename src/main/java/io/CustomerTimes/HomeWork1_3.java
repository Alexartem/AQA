package io.CustomerTimes;
import java.util.Scanner;


public class HomeWork1_3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        float a,b;
        float s;
        System.out.print("Enter width  ");
        a = num.nextFloat();


        System.out.print("Enter length  ");
        b = num.nextFloat();
        s = a*b;
        System.out.println("Square = "+s);


    }
}
