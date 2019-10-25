package com.simple.design.builder;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: srh
 * @Date: 2019/4/29
 */
public class CarBuilderTest {

    public static void main(String[] args) {
        hanmaCarRun();
    }

    private static void hanmaCarRun() {
        List<CarSequenceEnum> sequence = Arrays.asList(CarSequenceEnum.START
                , CarSequenceEnum.ALARM
                , CarSequenceEnum.ENGINE
                , CarSequenceEnum.STOP);
        HanmaBuilder hanmaBuilder = new HanmaBuilder();
        hanmaBuilder.setQuence(sequence);
        AbstartCarModel carModel = hanmaBuilder.getCarModel();
        carModel.run();
    }

}
