package com.simple.design.abstractFactory;

/**
 * 白种人
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public abstract class AbstractWhitePerson implements Person {
    @Override
    public void getColor() {
        System.out.println("white");
    }
}

/***
 * 女性白种人
 */
class FemaleWhitePerson extends AbstractWhitePerson {

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
 * 男性白种人
 */
class MaleWhitePerson extends AbstractWhitePerson{
    @Override
    public void getSex() {
        System.out.println("man");
    }

    @Override
    public void talk(Operate operate) {
        operate.operate();
    }
}
