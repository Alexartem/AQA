package io.CustomerTimes.HW6;

public class HomeWork6_4 {



    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("zero division");
        }
    }
}
