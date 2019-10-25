package com.simple.design.proxy.jdk;

/**
 * 业务实现类
 *
 * @Author: srh
 * @Date: 2019/3/22
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String getUserName() {
        return "UserService";
    }
}
