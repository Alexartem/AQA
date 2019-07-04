package io.CustomerTimes.HW5;



import java.util.HashMap;
import java.util.Map;

public class HomeWork5_3 {

    public static void main(String[] args) {

        HashMap<String, Integer> myGarage = new HashMap<String, Integer>();

        myGarage.put("BMW", 5);
        myGarage.put("Audi",1);
        myGarage.put("Mersedes",7);

        System.out.println(myGarage);
        System.out.println();

        for(Map.Entry<String, Integer> entry: myGarage.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }

    }

}
