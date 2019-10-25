package com.simple.design.proxy.cglib;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 代理方法的过滤
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class UserServerCallBackFilter implements CallbackFilter {

    private static final String SELECT = "select";

    private static final String UPDATE = "update";

    /***
     * 这里返回的 int 类型代表的是 Enhancer.callBacks[ index ]，对应不同的回调方法
     */
    @Override
    public int accept(Method method) {
        String methodName = method.getName();
        int i;
        switch (methodName) {
            case SELECT:
                i = 0;
                break;
            case UPDATE:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return i;
    }

}
