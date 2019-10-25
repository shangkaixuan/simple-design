package com.simple.design.abstractFactory;

/**
 * 人
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public interface Person {

    /***
     * 获取肤色
     */
    void getColor();

    /**
     * 说话
     */
    void talk(Operate operate);

    /***
     * 获取性别
     */
    void getSex();

}

/***
 * 说话操作接口
 */
@FunctionalInterface
interface Operate {

    void operate();

}