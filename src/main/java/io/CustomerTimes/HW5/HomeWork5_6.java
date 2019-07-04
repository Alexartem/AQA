package io.CustomerTimes.HW5;

import java.util.ArrayList;



public class HomeWork5_6 {
    public static void main(String[] args) {


        ArrayList<String> text = new ArrayList<>();
        ArrayList<String> max = new ArrayList<>();

        text.add("Python1");
        text.add("Python2");
        text.add("JS");
        text.add("Ruby");
        text.add("C#");
        text.add("Java");
        text.add("Python3");
        text.add("JS");
        text.add("Ruby");
        text.add("C#");

//        for (String x : text) {
//
//            System.out.println(x);
//
//        }

        int largestString = text.get(0).length();
        int index= 0;

        for(int i = 0; i < text.size(); i++) {
            if(text.get(i).length() > largestString) {
                largestString = text.get(i).length();
                index = i;
                max.add(text.get(largestString));


            }
        }
        for (int i = 0; i<text.size(); i++)
            if (text.get(i).length() == largestString)
                System.out.println (text.get (i) + " index "+i);

    }

}
