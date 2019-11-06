package com.memory.service.impl;

import com.memory.dto.Result;
import com.memory.mapper.ViewUserMapper;
import com.memory.pojo.ViewUser;
import com.memory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.registry.infomodel.User;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 19-11-6 上午9:11
 * @Created by xns
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    ViewUserMapper viewUserMapper;


    /**
     * 插入用户数据
     * @param us
     * @return
     */
    @Override
    public Boolean registerUser(ViewUser us) {
        int a = viewUserMapper.insert(us);
        if(a==1) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 判断可登陆否?
     * @param userName
     * @param password
     * @return
     */
    @Override
    public Result userLogin(String userName, String password) {
        ViewUser userr = viewUserMapper.findByName(userName);
        if(userr == null){
            return new Result(false,"对不起，用户名不存在!!!",null);
        }else{
            if(userr.getPassword().equals(password)){
                return new Result(true,"登陆成功",null);
            }else{
                return new Result(false,"您的密码输入错误!!!",null);
            }
        }
    }
}
