package io.CustomerTimes.HW5;

import java.util.ArrayList;

public class HomeWork5_1 {

    public static void main(String[] args) {

        ArrayList<Integer> some = new ArrayList<>(5);

        for (Integer i=0; i<=4; i++) {
            some.add(i);
        }
        //some.add(56);some.add(56);some.add(56);some.add(56);

        for (Integer x : some){
            System.out.println(x);
        }
        System.out.println(some);


    }






}
