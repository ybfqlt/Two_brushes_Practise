package com.memory.mapper;

import com.memory.pojo.ViewUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ViewUserMapper {

       //注册
       int insert(ViewUser viewUser);

       //根据主键查询
        ViewUser  findById(int userId);

       //查询
//        List<ViewUser>  findAll();

       //删除
        int delete(int userId);

        //根据名字查询
        ViewUser findByName(String userName);
}
