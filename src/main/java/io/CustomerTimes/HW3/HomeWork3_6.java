package io.CustomerTimes;

import java.util.Scanner;

public class HomeWork3_6 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter integer number");

        int a;
        a = num.nextInt();
        System.out.print(getEvenDigitSum(a));



    }
    public static int getEvenDigitSum(int n) {

        int sum=0;
        int i;
//
        if (n<0) {
            return -1;
        }

        if (n==0){
            return 0;
        }

        for (i = n; i > 0;) {
            if ((i % 10) % 2 == 0) {
                sum += i % 10;

            }
            i /= 10;
        }
//        while(n>0) {
//
//            if (((n%10)%2)==0) {   // variant s WHILE
//
//                sum=sum+n%10;
//            }
//
//            n=n/10;
//
//
//        }return sum;

        return sum;
    }
}





