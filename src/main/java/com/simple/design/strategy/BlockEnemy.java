package com.simple.design.strategy;

/**
 * 锦囊三：孙夫人断后
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
