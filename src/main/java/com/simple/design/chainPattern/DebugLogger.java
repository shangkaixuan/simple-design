package com.simple.design.chainPattern;

/**
 * @author srh
 * @date 2019/10/16
 **/
public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        super(AbstractLogger.DEBUG);
    }

    @Override
    protected void writer(String message) {
        System.out.println("debug :: " + message);
    }
}
