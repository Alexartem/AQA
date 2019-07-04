package io.CustomerTimes.HW3;

import java.util.Random;

public class HomeWork3_4 {
    public static void main(String[] args){

        Random element = new Random();

        int[] arr = new int[10];
        int sum =0;

        for(int i=0; i<arr.length; i++){
            arr[i]=i;
            //System.out.println(arr);
        }

        for (int i=1; i<arr.length-1; i++){
            System.out.println("  " + arr[i]);
            sum += arr[i];

        }
        System.out.print("summa "+sum);




    }
}
