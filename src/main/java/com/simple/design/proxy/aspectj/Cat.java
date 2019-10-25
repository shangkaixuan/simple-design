package com.simple.design.proxy.aspectj;

import org.springframework.stereotype.Component;

/**
 * 业务类
 *
 * @Author: srh
 * @Date: 2019/3/20
 */
@Component
public class Cat implements Person {

    /***
     * 业务操作
     * @Discern 自定义注解用来标识切点
     */
    @Discern
    @Override
    public void say(String name) {
        System.out.println("您好：" + name);
    }

    @Override
    public void drink() {
        System.out.println("drink water");
    }

    /***
     * 嵌套方法
     */
    @Override
    public void nestMethod() {
        nestMethod2();
        System.out.println("nestMethod");
    }

    private void nestMethod2() {
        System.out.println("nestMethod2");
    }

}
