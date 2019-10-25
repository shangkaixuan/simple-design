package com.simple.design.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * UserServerImpl 的代理实现
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class UserServerProxy implements MethodInterceptor {


    /***
     * intercept
     *
     * @param object    表示要进行增强的对象
     * @param method    表示拦截的方法
     * @param args      数组表示参数列表
     * @param methodProxy   表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理对象执行");
        return methodProxy.invokeSuper(object,args);
    }
}
