package com.simple.design.factory;

/**
 * 人
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public interface Human {

    /***
     * 获取性别
     */
    void getSex();

}

/***
 * 女性
 */
class FemalHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("woman");
    }
}

/**
 * 男性
 */
class MaleHuman implements Human {
    @Override
    public void getSex() {
        System.out.println("man");
    }
}