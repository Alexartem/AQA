package io.CustomerTimes;

public class HomeWork3_3 {
    public static void main(String[] args) {

        int[] arr = new int[101];

        for (int i=arr.length-1;i>=1; i-- ) {
            arr[i] = i;
        }

        for (int i=arr.length-1; i > 0; i--) {
            System.out.print(" "+ arr[i]);
        }
    }
}
// переписать заполнение массива так ятоб заполнение начиналось с начала