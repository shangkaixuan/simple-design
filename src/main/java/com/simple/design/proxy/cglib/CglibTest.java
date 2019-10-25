package com.simple.design.proxy.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

/**
 * cglib 测试类
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class CglibTest {

    /***
     * enhancer.setInterceptDuringConstruction(false); 设置构造方法不拦截
     * @param args
     */
    public static void main(String[] args) {
        filterTest();
//        simpleTest();
    }

    /***
     * 对不同的方法采用不同的回调
     */
    private static void filterTest() {
        // Java 代理对象（可以为接口和非接口的方法进行拦截）
        Enhancer enhancer = new Enhancer();
        // 设置代理目标
        enhancer.setSuperclass(UserServerImpl.class);
        // 设置回调函数(对业务操作的代理实现)
        // NoOp.INSTANCE 即表示一个空的CallBack
        enhancer.setCallbacks(
                new Callback[]{
                        new UserServerProxy(),
                        new UserServerFilterProxy(),
                        NoOp.INSTANCE});
        // 设置代理方法的过滤
        enhancer.setCallbackFilter(new UserServerCallBackFilter());
        // 产生代理对象
        UserServerImpl proxy = (UserServerImpl) enhancer.create();
        proxy.select();
        proxy.update();
    }

    /***
     * 简单实现一
     */
    private static void simpleTest() {
        // Java 代理对象（可以为接口和非接口的方法进行拦截）
        Enhancer enhancer = new Enhancer();
        // 设置代理目标
        enhancer.setSuperclass(UserServerImpl.class);
        // 设置回调函数(对业务操作的代理实现)
        enhancer.setCallback(new UserServerProxy());
        // 产生代理对象
        UserServerImpl proxy = (UserServerImpl) enhancer.create();
        proxy.select();
        proxy.update();
    }

}
