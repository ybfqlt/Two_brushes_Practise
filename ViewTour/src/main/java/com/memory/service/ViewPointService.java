package com.memory.service;

import com.memory.dto.Result;
import com.memory.pojo.ViewPoint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname ViewPointService
 * @Description TODO
 * @Date 19-11-30 上午11:20
 * @Created by xns
 */
public interface ViewPointService {

    /**
     * 获取全部景点,并且按不同的周边顺序排序
     * @param flag
     * @return
     */
    List<ViewPoint> getAllView(Integer flag);

    Result search(String viewName);

    //查询所有景点
    public List<ViewPoint>  findAll();
    //根据viewId查询景点的详情
    public ViewPoint findById(int viewId);
    //添加景点
    public void  insert(ViewPoint  viewPoint);
    //修改景点
    public void update(@Param("viewPoint")ViewPoint viewPoint);
    //删除
    public void delete(int viewId);
    //统计景点个数
    public int findByCount();
    //根据viewId查找viewName
    public  String findByName(int viewId);
    //根据viewId查找地理位置
    public String findByAddress(int viewId);
    //根据viewId查询类型
    public String findByType(int  viewId);
    //根据viewId查询图片
    String findByImg(int viewId);

}
