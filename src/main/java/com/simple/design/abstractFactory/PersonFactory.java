package com.simple.design.abstractFactory;

/**
 * 工厂
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public interface PersonFactory {

    /***
     *  生产黄种人
     */
    Person createYellowPerson();

    /***
     *  生产白种人
     */
    Person createWhitePerson();

}

/**
 * 女性工厂
 */
class FemaleFactory implements PersonFactory {
    @Override
    public Person createYellowPerson() {
        return new FemaleYellowPerson();
    }

    @Override
    public Person createWhitePerson() {
        return new FemaleWhitePerson();
    }
}

/***
 * 男性工厂
 */
class MaleFactory implements PersonFactory {
    @Override
    public Person createYellowPerson() {
        return new MaleYellowPerson();
    }

    @Override
    public Person createWhitePerson() {
        return new MaleWhitePerson();
    }
}