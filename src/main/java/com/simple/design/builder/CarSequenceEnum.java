package com.simple.design.builder;

/**
 * 汽车启动顺序的枚举
 *
 * @Author: srh
 * @Date: 2019/4/29
 */
public enum  CarSequenceEnum {

    START("start"),
    STOP("stop"),
    ALARM("alarm"),
    ENGINE("engine");

    private String value;

    CarSequenceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
