package com.simple.design.observer;

/**
 * @Author: srh
 * @Date: 2019/3/23
 */
public class ObServerTest {

    // 具体的主题（业务实现，只是维护了一个观察队列）
    private static ConcreteSubject subject = new ConcreteSubject();
    // 观察接口的实现
    private static ConcreteObServer obServer = new ConcreteObServer();

    public static void main(String[] args) {

        // 主题添加观察者（业务操作完成后要通知观察）
        subject.attach(obServer);
        // 操作完成业务
        System.out.println("业务操作完成");
        // 调用观察者的推送机制
        subject.inform();
    }

}
