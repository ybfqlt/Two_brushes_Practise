package com.memory.service;

import com.memory.dto.Result;
import com.memory.pojo.ViewPoint;

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

}
