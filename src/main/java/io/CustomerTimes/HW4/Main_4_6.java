package io.CustomerTimes.HW4;

public class Main_4_6 {
    public static void main(String[] args){


        Printer_4_6 printer1 = new Printer_4_6("Canon", "S500", "Laser", false, true,5,0,0,5,1000);
        Printer_4_6 printer2 = new Printer_4_6("HP", "M80", "Matirix", false, false,20,90,35,50,100);
        Printer_4_6 printer3 = new Printer_4_6("Canon", "S500", "Laser", false, true,5,40,20,5,1000);
        Printer_4_6 printer4 = new Printer_4_6("Canon", "S500", "Laser", false, true,95,90,90,95,1000);

        Printer_4_6 printer5 = new Printer_4_6();
        printer5.setManufacturer("Epson");
        printer5.setModel("x200");
        printer5.setType("Stream");
        printer5.setColor(true);printer5.setDuplex(true);printer5.setPrintedPages(200);
//        System.out.println(printer5.getTonerLevelBlack());
//        printer5.addAllTonerLevels(70,50,40,60);
//        System.out.println(printer5.getTonerLevelBlack());
//
//        printer4.addAllTonerLevels(70,60,50,115);
//        System.out.println(printer4.getTonerLevelBlack()+" "+printer4.getTonerLevelBlue());
//

//        printer1.setTonerLevelBlack(700);
//        System.out.println(printer1.getTonerLevelBlack());
//
//        printer1.addAllTonerLevels(70,50,50,40);
//        System.out.println(printer1.getTotalTonerLevel());

        printer2.getAllTonerLevels();
        printer3.getAllTonerLevels();














//        System.out.println(printer1.getTotalTonerLevel());
//        System.out.println(printer2.getTotalTonerLevel());
//        System.out.println(printer3.getTotalTonerLevel());
//        System.out.println(printer4.getTotalTonerLevel());
//
//        System.out.println(printer1.printerStatus());
//        System.out.println(printer2.printerStatus());
//        System.out.println(printer3.printerStatus());
//        System.out.println(printer4.printerStatus());
//
//
//        System.out.println(printer1.printedSheets());








    }



}
