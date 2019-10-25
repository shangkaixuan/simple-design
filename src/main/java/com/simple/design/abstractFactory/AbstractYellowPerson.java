package com.simple.design.abstractFactory;

/**
 * 黄种人
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public abstract class AbstractYellowPerson implements Person{

    @Override
    public void getColor() {
        System.out.println("Yellow");
    }

}

/***
 * 女性黄种人
 */
class FemaleYellowPerson extends AbstractYellowPerson {

    @Override
    public void getSex() {
        System.out.println("woman");
    }

    @Override
    public void talk(Operate operate) {
        operate.operate();
    }
}

/***
 * 男性黄种人
 */
class MaleYellowPerson extends AbstractYellowPerson{
    @Override
    public void getSex() {
        System.out.println("man");
    }

    @Override
    public void talk(Operate operate) {
        operate.operate();
    }

}