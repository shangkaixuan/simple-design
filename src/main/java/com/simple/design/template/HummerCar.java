package com.simple.design.template;

/**
 * 悍马车型
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public class HummerCar extends AbstartCarTemplate {
    @Override
    protected void alarm() {
        System.out.println("hummAlarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("hummEngine");
    }

    @Override
    protected boolean isAlarm() {
        return true;
    }
}
