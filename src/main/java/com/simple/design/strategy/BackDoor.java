package com.simple.design.strategy;

/**
 * 锦囊一：找乔国老走后门
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老走后门");
    }
}
