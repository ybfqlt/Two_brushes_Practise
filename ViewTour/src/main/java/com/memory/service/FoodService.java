package com.memory.service;

import com.memory.dto.Result;
import com.memory.pojo.ViewFood;

import java.util.Map;

/**
 * @Classname FoodService
 * @Description TODO
 * @Date 19-11-30 上午10:46
 * @Created by xns
 */
public interface FoodService {
    /**
     * 增加住宿
     * @param viewFood
     * @return
     */
    Result addFood(ViewFood viewFood);

    /**
     * 获取所有住宿
     * @param viewId
     * @return
     */
    Map<String,Object> getFood(Integer viewId);

    /**
     * 修改住宿
     * @param viewFood
     * @return
     */
    Result modifyFood(ViewFood viewFood);

    /**
     * 删除某住宿
     * @param foodId
     * @return
     */
    Result deleteFood(Integer foodId);

    /**
     * 根据住宿id获取某住宿信息
     * @param foodId
     * @return
     */
    ViewFood getOneFood(Integer foodId);
}
