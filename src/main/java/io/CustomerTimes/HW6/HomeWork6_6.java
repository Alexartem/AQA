package io.CustomerTimes.HW6;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HomeWork6_6 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
        List<Integer> myList = new ArrayList<Integer>();

        try{
            System.out.println("Enter numbers");
            int a ;
            do {
                Scanner num = new Scanner(System.in);
                a = num.nextInt();

                myList.add(a);

            } while (true);

        }catch (InputMismatchException e) {
            System.out.println(myList);
        }

    }
}
