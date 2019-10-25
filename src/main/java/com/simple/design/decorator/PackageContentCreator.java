package com.simple.design.decorator;

/**
 * 装饰者模式 - 业务实现
 *
 * @Author: srh
 * @Date: 2019/3/21
 */
public class PackageContentCreator implements IPackageCreator {

    @Override
    public String hadlerContent() {
        return "冷藏食品味道更佳 - creator";
    }

}
