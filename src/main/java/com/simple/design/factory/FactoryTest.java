package com.simple.design.factory;

/**
 * @Author: srh
 * @Date: 2019/4/29
 */
public class FactoryTest {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        MaleHuman human = factory.createHuman(MaleHuman.class);
        human.getSex();
    }
}
