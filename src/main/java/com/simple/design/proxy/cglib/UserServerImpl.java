package com.simple.design.proxy.cglib;

/**
 * 主题
 *
 * @Author: srh
 * @Date: 2019/3/23
 */
public class UserServerImpl {

   public void select(){
       System.out.println("UserServerImpl -> select");
   }

    public void update(){
        System.out.println("UserServerImpl -> update");
    }

}
