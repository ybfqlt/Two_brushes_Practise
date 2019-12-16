package com.memory.mapper;
import com.memory.pojo.ViewPoint;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewPointMapper {

//    //修改
//    int update(ViewPoint viewPoint);

    //根据主键查询一个景点
    ViewPoint findById(int viewId);

    //查询全部景点
    List<ViewPoint> findAll();

    List<ViewPoint> findAllByRouter();

    List<ViewPoint> findAllByFood();

    List<ViewPoint> findAllByArView();

    List<ViewPoint> findAllByHotel();

    ViewPoint findByName(String viewName);

    //添加景点
    public  void  insert(ViewPoint  viewPoint);
    //修改景点
    public void update(@Param("viewPoint")ViewPoint viewPoint);
    //删除
    public void delete(int viewId);
    //统计景点个数
    public int findByCount();
    //根据viewId查找viewName
    public  String findName(int viewId);
    //根据viewId查找地理位置
    public String findByAddress(int viewId);
    //根据viewId查询类型
    public String findByType(int  viewId);
    //根据viewId查询图片
    String findByImg(int viewId);
}
