package io.CustomerTimes.HW6;

public class HomeWork6_3 {


    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);


        try {
            int b = 10 / a;

        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }


        try {
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBounds");
        }




    }
}



