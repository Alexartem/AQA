package io.CustomerTimes.HW6;

public class ZeroException extends  Exception{

    private String error;

    public ZeroException (String message){
        super(message);

    }

    public String toString(){
        return "Zero is not allowed!!!";
    }


}
