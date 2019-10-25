package com.simple.design.single;

import java.io.*;

/**
 * 内部类
 *  结论：静态内部类，加载父类的时候不会加载静态内部类，只有调用内部类的时候才会执行加载
 *
 * @Author: srh
 * @Date: 2019/3/19
 */
public class StaticSingle implements Serializable {

    // 1.私有化构造方法
    private StaticSingle() {}
    // 2.创建静态内部类
    private static class SingleHolder {
        private static StaticSingle instance = new StaticSingle();
        static {
            System.out.println("内部类：" + instance);
        }
    }

    public static StaticSingle getInstance () {
        return SingleHolder.instance;
    }

    public static void print(){
        System.out.println("public method");
    }

}
class StaticSingleTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final String path = "D://single.obj";

        StaticSingle instance = StaticSingle.getInstance();
        System.out.println("before：" + instance);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        outputStream.writeObject(instance);
        outputStream.flush();
        outputStream.close();

        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(path));
        StaticSingle readerSingle = (StaticSingle) reader.readObject();
        reader.close();
        System.out.println("after：" + readerSingle);

        System.out.println("两者是否相同：" + (instance == readerSingle));
    }
}
