package com.simple.design.decorator;

/**
 * 业务 - 抽象增强类
 *  <p> 目的：分离性能组件与业务功能组件 </p>
 *
 * @Author: srh
 * @Date: 2019/3/21
 */
abstract class AbstractPackageDecorator implements IPackageCreator{

    /***
     * 业务功能
     */
    IPackageCreator component;

    AbstractPackageDecorator(IPackageCreator p) {
        this.component = p;
    }

}
