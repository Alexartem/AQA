package io.CustomerTimes.HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork6_1 {


    public static void main(String[] args) throws ZeroException {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter integer number");

        int a;
        a = num.nextInt();
        condition(a);
    }

    public static void condition(int n) throws ZeroException {
        String z;
        if (n > 0) {
            z = "Number > 0";
            System.out.println(z);
        } else if (n == 0) {
            throw new ZeroException("exception");

        } else if (n < 0) {
            z = "Number < 0";
            System.out.println(z);
        }
        return;


    }

}
