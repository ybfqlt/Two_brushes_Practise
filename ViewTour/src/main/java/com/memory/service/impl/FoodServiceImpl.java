package com.memory.service.impl;

import com.memory.dto.Result;
import com.memory.mapper.ViewFoodMapper;
import com.memory.mapper.ViewPointMapper;
import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.ViewFood;
import com.memory.pojo.ViewHotel;
import com.memory.pojo.ViewPoint;
import com.memory.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname FoodServiceImpl
 * @Description TODO
 * @Date 19-11-30 上午10:47
 * @Created by xns
 */
@Service("FoodServiceImpl")
public class FoodServiceImpl implements FoodService {

    @Autowired
    ViewFoodMapper viewFoodMapper;

    @Autowired
    ViewPointMapper viewPointMapper;

    @Autowired
    ViewStatisticMapper viewStatisticMapper;

    /**
     * 添加住宿
     *
     * @param viewFood
     * @return
     */
    @Override
    public Result addFood(ViewFood viewFood) {
        if (viewFoodMapper.insert(viewFood) != 0) {
            viewStatisticMapper.increse(viewFood.getViewId(),2);
            return new Result(true, "添加成功", null);
        } else {
            return new Result(false, "添加失败", null);
        }
    }

    /**
     * 获取所有美食
     *
     * @param viewId
     * @return
     */
    @Override
    public Map<String, Object> getFood(Integer viewId) {
        Map<String, Object> map = new HashMap<>();
        List<ViewFood> lists = viewFoodMapper.findByViewId(viewId);
        ViewPoint viewPoint = viewPointMapper.findById(viewId);
        map.put("viewName", viewPoint.getViewName());
        map.put("food", lists);
        return map;
    }

    /**
     * 修改
     *
     * @param viewFood
     * @return
     */
    @Override
    public Result modifyFood(ViewFood viewFood) {
        if (viewFoodMapper.update(viewFood) != 0) {
            viewFood = viewFoodMapper.findById(viewFood.getFoodId());
            return new Result(true, "修改成功", viewFood);
        } else {
            viewFood = viewFoodMapper.findById(viewFood.getFoodId());
            return new Result(false, "修改失败", viewFood);
        }
    }

    /**
     * 删除美食
     *
     * @param FoodId
     * @return
     */
    @Override
    public Result deleteFood(Integer FoodId) {
        if (viewFoodMapper.delete(FoodId) != 0) {
            return new Result(true, "删除成功", null);
        } else {
            return new Result(false, "删除失败", null);
        }
    }

    /**
     * 根据美食id返回美食信息
     *
     * @param FoodId
     * @return
     */
    @Override
    public ViewFood getOneFood(Integer FoodId) {
        return viewFoodMapper.findById(FoodId);
    }
}
