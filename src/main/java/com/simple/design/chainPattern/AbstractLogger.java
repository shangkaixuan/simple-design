package com.simple.design.chainPattern;

/**
 * @author srh
 * @date 2019/10/16
 **/
public abstract class AbstractLogger {

    static final int INFO = 1;
    static final int DEBUG = 2;
    static final int ERROR = 3;

    private int level;
    protected AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message) {
        if (this.level <= ERROR) {
            writer(message);
        }
        if (this.nextLogger != null) {
            nextLogger.logMessage(message);
        }
    }

    protected abstract void writer(String message);
}
