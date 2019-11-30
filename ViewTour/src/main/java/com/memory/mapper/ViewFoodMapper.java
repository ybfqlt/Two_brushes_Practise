package com.memory.mapper;

import com.memory.pojo.ViewFood;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewFoodMapper {

    //增加食物
    int insert(ViewFood viewFood);

    //根据主键删除一个食物
    int delete(int foodId);

//    //修改
//    int update(ViewFood viewFood);

    //根据主键查询一个食物
    ViewFood  findById(int foodId);

    //查询全部食物
    List<ViewFood > findAll();


    //据景点id查询所有美食
    List<ViewFood> findByViewId(Integer viewId);

    //更新
    int update(ViewFood viewFood);
}
