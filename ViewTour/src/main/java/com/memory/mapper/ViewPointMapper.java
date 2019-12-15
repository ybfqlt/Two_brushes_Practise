package com.memory.mapper;
import com.memory.pojo.ViewPoint;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewPointMapper {

    //增加一个景点
    int insert(ViewPoint viewPoint);

    //根据主键删除一个景点
    int delete(int viewId);

//    //修改
//    int update(ViewPoint viewPoint);

    //根据主键查询一个景点
    ViewPoint  findById(int viewId);

    //查询全部景点
    List<ViewPoint> findAll();

    List<ViewPoint> findAllByRouter();

    List<ViewPoint> findAllByFood();

    List<ViewPoint> findAllByArView();

    List<ViewPoint> findAllByHotel();

    ViewPoint findByName(String viewName);
}
