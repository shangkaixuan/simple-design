package com.simple.design.single;

/**
 * 延迟加载
 *
 * @Author: srh
 * @Date: 2019/3/19
 */
public class LazySingle {

    // 1.声明类属性（未初始值）
    private static LazySingle instance = null;
    // 2.私有化构造
    private LazySingle () {}
    // 3.对外提供获取实例的延迟加载方法
    public static LazySingle getInstance() {
        if ( instance == null ) {
            instance = new LazySingle();
        }
        return instance;
    }

}
class LazySingleTest {
    public static void main(String[] args) {
        System.out.println( LazySingle.getInstance() );
    }
}