package com.simple.design.observer;

import java.awt.*;

/**
 * 观察者接口
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public interface IObServer {

    /***
     * 通知监听 (当观察到业务操作执行结束后会触发此监听事件)
     * @param event 事件
     */
    void printLog(Event event);

}
