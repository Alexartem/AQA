package io.CustomerTimes.HW6;

import java.util.Scanner;

import static io.CustomerTimes.HW6.HomeWork6_1.condition;

public class HomeWork6_1_1 {

    public static void main(String[] args)  {

        try{
            Scanner num = new Scanner(System.in);
            System.out.println("Enter integer number");

            int a;
            a = num.nextInt();
            condition(a);
        }
        catch (ZeroException e){
            System.out.println("Error zero"); //Message that I want to show

        }

    }
}