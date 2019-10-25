package com.simple.design.builder;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车模型
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public abstract class AbstartCarModel {

    /***
     * 汽车的启动顺序
     */
    private List<CarSequenceEnum> sequence = new ArrayList<CarSequenceEnum>();

    public List<CarSequenceEnum> getSequence() {
        return sequence;
    }

    public void setSequence(List<CarSequenceEnum> sequence) {
        this.sequence = sequence;
    }

    protected abstract void start();

    protected abstract void stop();

    /**
     * 喇叭声
     */
    protected abstract void alarm();

    /***
     * 引擎
     */
    protected abstract void emgoneBoom();

    final public void run() {
        if (CollectionUtils.isEmpty(this.sequence)) {
            throw new RuntimeException("启动故障");
        }
        this.sequence.forEach(q -> {
            switch (q) {
                case START:
                    this.start();
                    break;
                case STOP:
                    this.stop();
                    break;
                case ALARM:
                    this.alarm();
                    break;
                case ENGINE:
                    this.emgoneBoom();
                    break;
                default:
                    break;
            }
        });
    }

}

/***
 * 悍马车型
 */
class HanmaCar extends AbstartCarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车Run");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车Alarm");
    }

    @Override
    protected void emgoneBoom() {
        System.out.println("奔驰车Emgone");
    }
}

/***
 * 本田车型
 */
class BenTianCar extends AbstartCarModel {
    @Override
    protected void start() {
        System.out.println("本田Run");
    }

    @Override
    protected void stop() {
        System.out.println("本田Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("本田Alarm");
    }

    @Override
    protected void emgoneBoom() {
        System.out.println("本田Emgone");
    }
}
