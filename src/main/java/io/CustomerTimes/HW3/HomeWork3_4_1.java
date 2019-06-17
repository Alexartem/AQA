package io.CustomerTimes;

import java.util.Random;

public class HomeWork3_4_1 {

    public static void main(String[] args) {

        Random element = new Random();
        int sum=0;

        int num[] = new int[10];
        for (int i=0; i<num.length; i++) {
            num[i] = (int) (Math.random()*100);

        }
        for (int i=1; i<num.length-1; i++) {
            System.out.println(num[i]);
            sum+=num[i];
        }
        System.out.println("summa   "+sum);





    }
}
