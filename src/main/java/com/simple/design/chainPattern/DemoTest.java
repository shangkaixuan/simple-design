package com.simple.design.chainPattern;

/**
 * @author srh
 * @date 2019/10/16
 **/
public class DemoTest {

    public static void main(String[] args) {
        AbstractLogger errorLogger = new ErrorLogger();
        errorLogger.logMessage("this is errorMsg");
        System.out.println();

        AbstractLogger debugLogger = new DebugLogger();
        debugLogger.logMessage("this is debugMsg");
        System.out.println();

        AbstractLogger infoLogger = new InfoLogger();
        infoLogger.logMessage("this is infoMsg");
    }

}
