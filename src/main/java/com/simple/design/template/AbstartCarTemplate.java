package com.simple.design.template;

/**
 * 模板接口
 *
 * @Author: srh
 * @Date: 2019/4/27
 */
public abstract class AbstartCarTemplate {

    /***
     * 抽象的喇叭声
     */
    protected abstract void alarm();

    /***
     * 抽象的引擎声
     */
    protected abstract void engineBoom();

    /***
     * 是否需要启动时鸣笛
     * @return  钩子方法，由子类去控制
     */
    protected abstract boolean isAlarm();

    /***
     * 运行
     */
    public void run() {
        if(this.isAlarm()) {
            this.alarm();
        }
        this.engineBoom();
    }

}
