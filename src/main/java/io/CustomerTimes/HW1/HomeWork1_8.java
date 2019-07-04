package io.CustomerTimes.HW1;
import java.util.ArrayList;
import java.lang.String;


public class HomeWork1_8 {
    public static void main(String[] args) {
        // write your code here

        int[] a = {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        printList(transformIntToChar(a));

    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
