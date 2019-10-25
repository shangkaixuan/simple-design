package com.simple.design.observer;

/**
 * 主题接口
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public interface ISubject {

    /***
     * 添加观察者
     */
    void attach(IObServer obServer);

    /***
     * 移除观察者
     */
    void detach(IObServer obServer);

    /***
     * 通知队列中的所有观察者
     */
    void inform();

}
