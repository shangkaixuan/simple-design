package com.simple.design.template;

/**
 * @Author: srh
 * @Date: 2019/4/27
 */
public class HondaCar extends AbstartCarTemplate {
    @Override
    protected void alarm() {
        System.out.println("hondaAlarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("hondaEngine");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
