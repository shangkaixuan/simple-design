package com.simple.design.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: srh
 * @Date: 2019/3/22
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        // 针对实现的接口，不然会报转换异常
        ProxyHandler handler = new ProxyHandler(new UserServiceImpl());
        IUserService instance = (IUserService) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(),
                UserServiceImpl.class.getInterfaces(),
                handler);
        System.out.println( instance.getUserName() );

    }

}
