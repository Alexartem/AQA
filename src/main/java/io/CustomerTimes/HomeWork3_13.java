package io.CustomerTimes;

import java.util.Scanner;

public class HomeWork3_13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter integer number");

        int a;
        a = num.nextInt();
        condition(a);


    }

    public static void condition(int n) {
        String z;

        if (n > 0) {
            z ="Number > 0";
            System.out.println(z);
        }

        if (n == 0) {
            z ="Number = 0";
            System.out.println(z);
        }

        if (n < 0) {
            z ="Number < 0";
            System.out.println(z);
        }return;


    }
}
