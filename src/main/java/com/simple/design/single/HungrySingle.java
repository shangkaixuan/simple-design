package com.simple.design.single;

/**
 * 单例- 恶汉式
 *
 * @Author: srh
 * @Date: 2019/3/19
 */
public class HungrySingle {

    // 1.类的静态初始化类
    private static HungrySingle instance = new HungrySingle();
    // 2.私有化构造方法
    private HungrySingle () {}
    // 3.对外提供静态
    public static HungrySingle getInstance() {
        return instance;
    }

}
class HungrySingleTest {
    public static void main(String[] args) {
        System.out.println( HungrySingle.getInstance() );
    }
}