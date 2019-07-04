package io.CustomerTimes.HW3;

import java.util.Scanner;

public class HomeWork3_8 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter height of the rectangle end press Enter");
        int h;
        h = num.nextInt();

        System.out.println("Enter width of the rectangle end press Enter");
        int w;
        w = num.nextInt();


        for(int i=1; i<=h; i++ ) {
            System.out.println();

            for(int j=1; j<=w; j++){
                System.out.print("*");
            }
        }
    }
}
