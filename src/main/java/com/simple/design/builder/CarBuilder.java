package com.simple.design.builder;

import java.util.List;

/**
 * 组装机器
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public abstract class CarBuilder {

    /***
     * 设置汽车的启动顺序
     * @param sequence
     */
    public abstract void setQuence(List<CarSequenceEnum> sequence);

    /***
     * 得到车型
     * @return
     */
    public abstract AbstartCarModel getCarModel();

}

/**
 * 悍马机器
 */
class HanmaBuilder extends CarBuilder{

    private HanmaCar hanmaCar = new HanmaCar();

    @Override
    public void setQuence(List<CarSequenceEnum> sequence) {
        this.hanmaCar.setSequence(sequence);
    }

    @Override
    public AbstartCarModel getCarModel() {
        return this.hanmaCar;
    }
}

/***
 * 本田机器
 */
class BenTianBuilder extends CarBuilder {

    private BenTianCar benTianCar = new BenTianCar();

    @Override
    public void setQuence(List<CarSequenceEnum> sequence) {
        this.benTianCar.setSequence(sequence);
    }

    @Override
    public AbstartCarModel getCarModel() {
        return this.benTianCar;
    }
}