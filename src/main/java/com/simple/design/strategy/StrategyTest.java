package com.simple.design.strategy;

/**
 * 策略模式的测试类
 *      由 lambda + FunctionInterface -> 原方法
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public class StrategyTest {

    public static void main(String[] args) {
        Content content;
        // 妙计一：
        content = new Content(new BackDoor());
        System.out.print("锦囊一：");
        content.operate();
        // 妙计二：
        content = new Content(new GivenGreenLight());
        System.out.print("锦囊二：");
        content.operate();
        // 妙计三：
        content = new Content(new BlockEnemy());
        System.out.print("锦囊三：");
        content.operate();

    }

}
