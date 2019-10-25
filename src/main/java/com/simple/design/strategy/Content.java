package com.simple.design.strategy;

/**
 * 锦囊
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
class Content {

    private IStrategy strategy;

    Content(IStrategy strategy) {
        this.strategy = strategy;
    }

    /***
     * 出妙计
     */
    void operate() {
        strategy.operate();
    }
}
