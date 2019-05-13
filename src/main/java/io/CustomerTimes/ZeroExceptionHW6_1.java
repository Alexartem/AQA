package io.CustomerTimes;


public class ZeroExceptionHW6_1 extends Exception {

    public ZeroExceptionHW6_1() {
    }

    public ZeroExceptionHW6_1(String message) {
        super(message);
    }

    public ZeroExceptionHW6_1(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroExceptionHW6_1(Throwable cause) {
        super(cause);
    }

    public ZeroExceptionHW6_1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
