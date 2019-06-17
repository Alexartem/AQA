package io.CustomerTimes;

import java.util.Scanner;

public class HomeWork3_9 {

    public static void main(String[] args) {


        String snow = "*";
        Scanner num = new Scanner(System.in);
        System.out.println("Enter width of the tree end press Enter");

        int w;
        w = num.nextInt();


        for(int i=1; i<=w; i++) {
            System.out.println();
            for(int j=1; j<i+1; j++) {
                System.out.print(snow);
            }
        }
    }
}
