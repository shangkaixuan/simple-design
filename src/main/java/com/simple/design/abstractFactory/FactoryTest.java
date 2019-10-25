package com.simple.design.abstractFactory;

/**
 * @Author: srh
 * @Date: 2019/4/29
 */
public class FactoryTest {

    public static void main(String[] args) {
        // 创建男性与女性工厂
        MaleFactory maleFactory = new MaleFactory();
        FemaleFactory femaleFactory = new FemaleFactory();
        // 创建不同肤色的人
        Person whitePerson = maleFactory.createWhitePerson();
        Person yellowPerson = maleFactory.createYellowPerson();
        System.out.println("--- 男性肤色 ---");
        whitePerson.getColor();
        yellowPerson.getColor();
        Person whitePerson1 = femaleFactory.createWhitePerson();
        Person yellowPerson1 = femaleFactory.createYellowPerson();
        System.out.println("--- 女性肤色 ---");
        whitePerson1.getColor();
        yellowPerson1.getColor();


    }

}
