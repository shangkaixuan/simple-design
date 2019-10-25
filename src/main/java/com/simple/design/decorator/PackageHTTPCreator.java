package com.simple.design.decorator;

import java.util.Date;

/**
 *添加HTTP数据
 *
 * @Author: srh
 * @Date: 2019/3/21
 */
public class PackageHTTPCreator extends AbstractPackageDecorator {

    PackageHTTPCreator(IPackageCreator p) {
        super(p);
    }

    @Override
    public String hadlerContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cache-Control：no-cache\n");
        sb.append("Date：");
        sb.append(new Date().toString());
        sb.append("\n");
        // 执行业务操作
        sb.append(component.hadlerContent());
        return sb.toString();
    }

}
