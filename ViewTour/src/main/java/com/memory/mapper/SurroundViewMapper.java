package com.memory.mapper;

import com.memory.pojo.SurroundView;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface SurroundViewMapper {


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

    //根据viewId查询周边景点
    public List<SurroundView> findByViewId(int viewId);

    //增加景点
    public void insert(SurroundView surroundView);

    //修改周边景点
    public void update(SurroundView surroundView);


    //根据arViewId查询单个周边景点的信息
    SurroundView findByArViewId(int arViewId);
    //统计周边景点的个数
    public int findByCount();

    //查找viewId
    int findId(Integer arViewId);
}
