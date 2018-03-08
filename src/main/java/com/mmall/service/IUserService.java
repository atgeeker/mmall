package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by zhuyangyong on 2018/3/8.
 */
public interface IUserService {

    ServerResponse<User> login(String usernamer, String password);
}
