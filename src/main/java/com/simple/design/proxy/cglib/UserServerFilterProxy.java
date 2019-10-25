package com.simple.design.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理实现二
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class UserServerFilterProxy implements MethodInterceptor {

    /***
     * intercept
     *
     * @param o    表示要进行增强的对象
     * @param method    表示拦截的方法
     * @param objects      数组表示参数列表
     * @param methodProxy   表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Begin：" + System.currentTimeMillis());
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("End：" + System.currentTimeMillis());
        return invoke;
    }
}
