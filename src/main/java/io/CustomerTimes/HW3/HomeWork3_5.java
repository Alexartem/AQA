package io.CustomerTimes.HW3;

import java.util.Scanner;

public class HomeWork3_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter four numbers");

        int a,b,c,d;
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        d = num.nextInt();

        System.out.println("a = "+a+" b = "+b+ " c = "+c+" d = "+d);
        System.out.println("MIN = "+min(a,b,c,d));

    }

    public static int min(int a, int b, int c, int d) {
        //int m;
        //if
        //(min(a,b) < min(c,d))   // через простое сравнение возврата от метода мин пар чисел поочередно
           // m=a;
        //else
           // m=c;
        //return m;
        int m = min(min(a,b),min(c,d));
        return m ; // супер рационально))
    }


    public static int min(int a, int b) {
        int m1;
        if (a < b)
            m1 = a;
        else
            m1 = b;

        return m1;

    }

}


