package com.simple.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @Author: srh
 * @Date: 2019/3/22
 */
public class ProxyHandler implements InvocationHandler {

    // 原业务对象
    private Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy invoke");
        System.out.println("Target: " + target.getClass());
        return method.invoke(target,args);
    }
}
