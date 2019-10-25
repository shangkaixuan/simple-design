package com.simple.design.factory;

/**
 * 抽象工厂
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public abstract class AbstractHumanFactory implements Human{

    /***
     * @param c     class类型
     * @param <T>   Human的子类
     */
    public abstract <T extends Human> T createHuman(Class<T> c);

}

/***
 * 人类工厂
 */
class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T human = null;
        try{
            human = (T) Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("工厂反射异常");
        }
        return human;
    }

    @Override
    public void getSex() {

    }
}

