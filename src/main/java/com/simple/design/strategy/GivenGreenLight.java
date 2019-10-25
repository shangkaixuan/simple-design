package com.simple.design.strategy;

/**
 * 锦囊二：吴国太开绿灯
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("吴国太开绿灯");
    }
}
