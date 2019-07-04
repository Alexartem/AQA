package io.CustomerTimes.HW6;

public class HomeWork6_2 {

    public static void main(String[] args) {
        try {
            System.out.println(divideByZero());

        } catch (ArithmeticException e){
            System.out.println("fixed");
        }


    }

    public static int divideByZero() throws ArithmeticException {
        int a = 5;
        int b = 0;
        return a / b;
    }


}
