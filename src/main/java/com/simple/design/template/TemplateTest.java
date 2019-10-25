package com.simple.design.template;

/**
 * @Author: srh
 * @Date: 2019/4/27
 */
public class TemplateTest {

    public static void main(String[] args) {
        HummerCar hummerCar = new HummerCar();
        HondaCar hondaCar = new HondaCar();

        hummerCar.run();
        hondaCar.run();
    }

}
