package com.simple.design.single;

import java.io.Serializable;

/**
 * 采用枚举类的方式实现单例
 *
 * @Author: srh
 * @Date: 2019/3/20
 */
public enum EnumSingle implements Serializable {

    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("test");
    }
}

class EnumSingleTest {
    public static void main(String[] args) {
        // 声明两个变量
        EnumSingle s = EnumSingle.INSTANCE;
        EnumSingle object = EnumSingle.INSTANCE;
        // 设置属性
        s.setName("One");
        object.setName("Object");
        // 比较是否一致
        if (s == object)
            System.out.println(" == ");
        else
            System.out.println(" != ");
    }
}