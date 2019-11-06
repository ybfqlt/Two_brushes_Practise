package com.memory.service;


import com.memory.dto.Result;
import com.memory.pojo.ViewUser;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 19-11-6 上午9:10
 * @Created by xns
 */
public interface UserService {
    /**
     * 注册
     * @param us
     * @return
     */
    Boolean registerUser(ViewUser us);

    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    Result userLogin(String userName,String password);
}
