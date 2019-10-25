package com.simple.design.proxy.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 自定义切面
 *
 * @Author: srh
 * @Date: 2019/3/20
 */
@Aspect
@Component
public class Advice {

    /***
     * 声明切点，针对实现@Distinct 注解的方法,属性或者构造...
     */
    @Pointcut(value = "@annotation(com.design.proxy.aspectj.Discern)")
    public void pointcut() {}

    /***
     * 切点的前置通知
     */
    @Before(value = "pointcut()")
    public void before() {
        System.out.println("pointcut before invoke ...");
    }

    /***
     * 切点的后置通知
     */
    @After(value = "pointcut()")
    public void after() {
        System.out.println("pointcut after invoke ...");
    }

    /***
     * 环绕通知
     */
    @Around(value = "execution(* com.design.proxy.aspectj.Person.drink(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        Object result = point.proceed();
        System.out.println("around after");
        return result;
    }

    /***
     * 嵌套
     */
    @Around(value = "execution(* com.design.proxy.aspectj.Person.nestMethod(..))")
    public Object around2(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        Object result = point.proceed();
        System.out.println("around after");
        return result;
    }

}
