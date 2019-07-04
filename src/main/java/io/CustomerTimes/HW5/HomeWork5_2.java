package io.CustomerTimes.HW5;

public class HomeWork5_2 {



    public enum Season {
        SUMMER,
        FALL,
        WINTER,
        SPRING
    }


    public static void main(String[] args){
        Season chosenSeason = Season.SUMMER;
        Season theWorstSeason = Season.FALL;
        for (Season i:Season.values()) {
            System.out.println(i);
        }
        System.out.println(chosenSeason+"  is better than   "+ theWorstSeason);



    }
}

