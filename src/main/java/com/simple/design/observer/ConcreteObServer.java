package com.simple.design.observer;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.awt.*;

/**
 * 观察者的实现，
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class ConcreteObServer implements IObServer {

    /***
     * 当监听的状态发生变化的时候会被主题进行回调，然后观察者内部可以进行逻辑处理
     * @param event 事件
     */
    @Override
    public void printLog(Event event) {
        Object target = event.target;
        if(target instanceof SecurityProperties.User) {
            SecurityProperties.User user = (SecurityProperties.User) target;
            System.out.println("消费者接受到消息：" + user.getName());
        }else {
            System.out.println("消费者接受到消息，Event " + target);
        }
    }

}
