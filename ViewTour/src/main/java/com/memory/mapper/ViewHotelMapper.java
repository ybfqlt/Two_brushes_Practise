package com.memory.mapper;

import com.memory.pojo.ViewHotel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewHotelMapper {

    //增加酒店
    int insert(ViewHotel viewHotel);

    //根据主键删除一个周边住宿
    int delete(int hotelId);

//    //修改
//    int update(ViewHotel viewHotel);

    //根据主键查询一个周边住宿
    ViewHotel  findById(int hotelId);

    //查询全部住宿
    List<ViewHotel> findAll();

    /**
     * 通过景点id查询
     * @param viewId
     * @return
     */
    List<ViewHotel> findByViewId(Integer viewId);

    /**
     * 更新
     * @param viewHotel
     * @return
     */
    int update(ViewHotel viewHotel);

    //统计周边住宿的个数
    public int findByCount();

}
