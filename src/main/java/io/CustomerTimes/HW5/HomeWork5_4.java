package io.CustomerTimes.HW5;

public class HomeWork5_4 {

    public static void main(String[] args){
        int count=0;
        int zero=0;
        int odd=0;

        int arr[] = new int[15];

        for(int i=0; i<15; i++) {

            arr[i] = (int) (Math.random()*9);
            System.out.print(" "+arr[i]);

            if ((arr[i]%2==0)&&(arr[i]!=0)) {
                count++;
            }

            if (arr[i]==0){
                zero++;
            }

            if ((arr[i]%2!=0)&&(arr[i]!=0)){
                odd++;
            }

        }
        System.out.println();
        System.out.println(" even numbers: "+count);
        System.out.println(" zero numbers: "+zero);
        System.out.print(" odd numbers: "+odd);

    }
}
