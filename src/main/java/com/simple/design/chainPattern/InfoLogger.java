package com.simple.design.chainPattern;

/**
 * @author srh
 * @date 2019/10/16
 **/
public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        super(AbstractLogger.INFO);
    }

    @Override
    protected void writer(String message) {
        System.out.println("info :: " + message);
    }
}
