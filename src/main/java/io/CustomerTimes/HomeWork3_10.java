package io.CustomerTimes;

import java.util.Scanner;

public class HomeWork3_10 {
    public static void main(String[] args) {

        String snow = "*";
        String space = " ";
        Scanner num = new Scanner(System.in);

        System.out.println("Enter width of the rectangle end press Enter");
        int w;
        w = num.nextInt();

        System.out.println("Enter height of the rectangle end press Enter");
        int h;
        h = num.nextInt();

        for (int i=1; i<=h; i++) {
            System.out.println();
            for (int j=1; j<=w; j++) {
                if (i==1 || j==1 || i==h || j==w) {
                    System.out.print(snow);
                }

                else {
                    System.out.print(space);
                }
            }
        }
    }
}
