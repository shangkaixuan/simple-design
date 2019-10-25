package com.simple.design.decorator;

/**
 * @Author: srh
 * @Date: 2019/3/21
 */
public class PackageCreatorTest {

    public static void main(String[] args) {
        IPackageCreator compont = new PackageHTTPCreator(
                new PackageHTMLCreator(
                        new PackageContentCreator()
                )
        );
        System.out.println( compont.hadlerContent() );

    }

}
