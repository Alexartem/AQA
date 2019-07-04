package io.CustomerTimes.HW4;

public class Printer_4_6 {

    private  String manufacturer;
    private  String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int printedPages;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;


    public Printer_4_6(){

    }

    public Printer_4_6 (String manufacturer,
                        String model,
                        String type,
                        boolean isColor,
                        boolean isDuplex,
                        int tonerLevelBlack,
                        int tonerLevelMagenta,
                        int tonerLevelBlue,
                        int tonerLevelYellow,
                        int printedPages ) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.isColor = isColor;
        this.model = model;
        this.isDuplex = isDuplex;
        this.tonerLevelBlack = tonerLevelBlack;
        this.printedPages = printedPages;
        this.tonerLevelYellow = tonerLevelYellow;
        this.tonerLevelMagenta = tonerLevelMagenta;
        this.tonerLevelBlue = tonerLevelBlue;

    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public boolean isColor() {
        return isColor;
    }

    public String getType() {
        return type;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack = tonerLevelBlack;
        if (this.tonerLevelBlack < 0) {
            this.tonerLevelBlack = 0;
        }else if (this.tonerLevelBlack > 100) {
            this.tonerLevelBlack = 100;
        }
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }

    public int getTonerLevelMagenta() {
        return tonerLevelMagenta;
    }

    public void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta = tonerLevelMagenta;
        if (this.tonerLevelMagenta < 0) {
            this.tonerLevelMagenta = 0;
        }else if (this.tonerLevelMagenta > 100) {
            this.tonerLevelMagenta = 100;
        }
    }

    public int getTonerLevelYellow() {
        return tonerLevelYellow;
    }

    public void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow = tonerLevelYellow;
        if (this.tonerLevelYellow < 0) {
            this.tonerLevelYellow = 0;
        }else if (this.tonerLevelYellow > 100) {
            this.tonerLevelYellow = 100;
        }
    }

    public int getTonerLevelBlue() {
        return tonerLevelBlue;
    }

    public void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue = tonerLevelBlue;
        if (this.tonerLevelBlue < 0) {
            this.tonerLevelBlue = 0;
        }else if (this.tonerLevelBlue > 100) {
            this.tonerLevelBlue = 100;
        }
    }


    public void addAllTonerLevels(int tonerLevelBlack, int tonerLevelBlue, int tonerLevelYellow, int tonerLevelMagenta ){

        this.tonerLevelBlack += tonerLevelBlack;
        if (this.tonerLevelBlack > 100) {
            this.tonerLevelBlack = 100;
            System.out.println("U overfilled black toner");
        }

        this.tonerLevelBlue += tonerLevelBlue;
        if (this.tonerLevelBlue > 100) {
            this.tonerLevelBlue = 100;
            System.out.println("U overfilled blue toner");
        }

        this.tonerLevelMagenta += tonerLevelMagenta;
        if (this.tonerLevelMagenta > 100) {
            this.tonerLevelMagenta = 100;
            System.out.println("U overfilled magenta toner");
        }

        this.tonerLevelYellow += tonerLevelYellow;
        if (this.tonerLevelYellow > 100)  {
            this.tonerLevelYellow = 100;
            System.out.println("U overfilled yellow toner");
        }

    }

    public void getAllTonerLevels (){
        int a = getTonerLevelBlack();
        int b = getTonerLevelBlue();
        int c = getTonerLevelMagenta();
        int d = getTonerLevelYellow();
        String name = getManufacturer()+"  "+ getModel()+" >> ";
        System.out.println(name + " Black toner level "+ a + ", Blue toner level " +b+ ", Magenta toner level "+c+", Yellow toner level "+d);
    }



    public int getTotalTonerLevel(){

        int totalLevel = (getTonerLevelBlack()+getTonerLevelBlue()+getTonerLevelYellow()+getTonerLevelMagenta())/4;
        return totalLevel;
    }

    public int printedSheets(){
        int printedSheets;

        if (isDuplex = false) {
            printedSheets = getTonerLevelBlack() * printedPages / 100;

        } else printedSheets = getTonerLevelBlack() * printedPages / 100/2;
        return printedSheets;
    }


    public String  printerStatus(){
        String status;
        int tonerLevel = getTotalTonerLevel();

        if (tonerLevel >= 90) {
            status = "Printer is full";
        }
        else if ((tonerLevel < 90) && (tonerLevel >= 30)) {
            status = "Ready for printing";
        }

        else if ((30 > tonerLevel) && (tonerLevel >=10)){
            status = "Low ink";
        }

        else {
            status = "Printer is empty";
        }
        return status;


    }













}


