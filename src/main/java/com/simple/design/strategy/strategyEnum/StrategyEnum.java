package com.simple.design.strategy.strategyEnum;

/**
 * @Author: srh
 * @Date: 2019/4/27
 */
public enum StrategyEnum {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    /***
     * 操作符
     */
    private String value;

    StrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 抽象操作方法
     *
     * @param a
     * @param b
     * @return
     */
    public abstract int exec(int a, int b);
}
