package io.CustomerTimes.HW3;

import java.util.Scanner;

public class HomeWork3_7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first integer number > 10");

        int a,b,d;
        a = num.nextInt();
        System.out.println("Enter second integer number > 10");
        b = num.nextInt();
        System.out.println(theGreatestCommonDivisor(a,b));

    }
    public static int theGreatestCommonDivisor(int a,int b){
        int divider=1;


        if (a<10 || b<10) {
            return -1;
        }


        else {
            for (int i=1; i<=Math.min(a,b);i++) {

                if ((a % i)==0 && (b % i)==0) {
                    divider=i;
                }

            }

        }

        return divider;
    }

}
