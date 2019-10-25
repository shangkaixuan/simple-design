package com.simple.design.observer;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.awt.*;
import java.util.Vector;

/**
 * 具体主题
 *
 *  todo 应该添加单一推送
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class ConcreteSubject implements ISubject {

    /***
     * 观察者队列
     */
    private Vector<IObServer> queue = new Vector<>();

    @Override
    public void attach(IObServer obServer) {
        queue.addElement(obServer);
    }

    @Override
    public void detach(IObServer obServer) {
        queue.removeElement(obServer);
    }

    /***
     * 推送消息
     */
    @Override
    public void inform() {
        SecurityProperties.User user = new SecurityProperties.User();
        user.setName("123");
        Event event = new Event(user,0,null);
        // 推送
        for (IObServer server : queue) {
            server.printLog(event);
        }
    }
}
