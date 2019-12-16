package com.memory.service;

import com.memory.pojo.SurroundView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SurroundViewService {
     //根据viewId查询周边景点
    public List<SurroundView> findByViewId(int viewId);
    //增加周边景点
    public void insert(SurroundView surroundView);
    //修改周边景点
    public void update(SurroundView surroundView);
    //删除周边景点
    public void delete(int arViewId);
    //根据arViewId查询单个周边景点的信息
    SurroundView findByArViewId(int arViewId);
    //统计周边景点的个数
    public int findByCount();

   //查找viewId
    int findId(Integer arViewId);
}
