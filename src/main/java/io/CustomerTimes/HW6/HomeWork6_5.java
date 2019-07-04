package io.CustomerTimes.HW6;

public class HomeWork6_5 {


    public static void main(String[] args) {

        try {
            String word = null;
            iCanThrowException(word);
        }
        catch (NullPointerException e) {
//            e.printStackTrace();
            System.out.println("Null pointer exception was catched");
        }
    }


    public static void iCanThrowException (String s) {
        int width = s.length();
        System.out.println(width);


    }


}
