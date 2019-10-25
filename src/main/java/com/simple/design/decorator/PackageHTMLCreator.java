package com.simple.design.decorator;

/**
 * 添加HTML数据
 *
 * @Author: srh
 * @Date: 2019/3/21
 */
public class PackageHTMLCreator extends AbstractPackageDecorator {

    public PackageHTMLCreator(IPackageCreator p) {
        super(p);
    }

    /**
     * 功能增强
     */
    @Override
    public String hadlerContent() {
        return "<html>" +
                component.hadlerContent() +
                "</html>";
    }

}
