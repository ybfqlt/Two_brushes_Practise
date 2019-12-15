package com.memory.mapper;

import com.memory.pojo.SurroundView;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface SurroundViewMapper {

    //增加一个周边景点
    int insert(SurroundView surroundView);

    //根据主键删除一个周边景点
    int delete(int arViewId);
//
//    //修改
//   int update(SurroundView surroundView);

    //根据主键查询一个周边景点
    SurroundView findById(int arViewId);

    //查询全部景点
    List<SurroundView> findAll();

    List<SurroundView> findByViewId(Integer viewId);
}
