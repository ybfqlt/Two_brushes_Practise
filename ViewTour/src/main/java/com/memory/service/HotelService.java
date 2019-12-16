package com.memory.service;

import com.memory.dto.Result;
import com.memory.pojo.ViewHotel;

import java.util.List;
import java.util.Map;

/**
 * @Classname HotelController
 * @Description TODO
 * @Date 19-11-30 上午10:47
 * @Created by xns
 */
public interface HotelService {

    /**
     * 增加住宿
     * @param viewHotel
     * @return
     */
    Result addHotel(ViewHotel viewHotel);

    /**
     * 获取所有住宿
     * @param viewId
     * @return
     */
    Map<String,Object> getHotel(Integer viewId);

    /**
     * 修改住宿
     * @param viewHotel
     * @return
     */
    Result modifyHotel(ViewHotel viewHotel);

    /**
     * 删除某住宿
     * @param hotelId
     * @return
     */
    Result deleteHotel(Integer hotelId);

    /**
     * 根据住宿id获取某住宿信息
     * @param HotelId
     * @return
     */
    ViewHotel getOneHotel(Integer HotelId);

    //根据viewId查询周边住宿
    public List<ViewHotel> findByViewId(int viewId);
    //统计周边住宿的个数
    public int findByCount();
}
