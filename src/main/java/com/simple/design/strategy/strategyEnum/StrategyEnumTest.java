package com.simple.design.strategy.strategyEnum;

/**
 * @Author: srh
 * @Date: 2019/4/27
 */
public class StrategyEnumTest {

    public static void main(String[] args) {

        // a+b
        int a = 10;
        int b = 2;
        String operate = "+";

        if (operate.equals(StrategyEnum.ADD.getValue())) {
            System.out.println(StrategyEnum.ADD.exec(a, b));
        } else if (operate.equals(StrategyEnum.SUB.getValue())) {
            System.out.println(StrategyEnum.SUB.exec(a, b));
        }
    }

}
