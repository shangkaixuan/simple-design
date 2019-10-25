package com.simple.design.chainPattern;

/**
 * @author srh
 * @date 2019/10/16
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        super(AbstractLogger.ERROR);
        setNextLogger(new DebugLogger());
    }

    @Override
    protected void writer(String message) {
        System.out.println("error :: " + message);
    }
}
