package com.memory.service.impl;

import com.memory.dto.Result;
import com.memory.mapper.*;
import com.memory.pojo.*;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ViewPointServiceImpl
 * @Description TODO
 * @Date 19-11-30 上午11:21
 * @Created by xns
 */
@Service("ViewPointService")
public class ViewPointServiceImpl implements ViewPointService {

    @Autowired
    ViewPointMapper viewPointMapper;

    @Autowired
    ViewFoodMapper viewFoodMapper;

    @Autowired
    ViewHotelMapper viewHotelMapper;

    @Autowired
    ViewRouterMapper viewRouterMapper;

    @Autowired
    SurroundViewMapper surroundViewMapper;

    /**
     * 景点列表
     * @param flag
     * @return
     */
    @Override
    public List<ViewPoint> getAllView(Integer flag) {
        List<ViewPoint> lists = new ArrayList<>();
        switch (flag){
            case 1:
               lists = viewPointMapper.findAllByRouter();
               break;
            case 2:
                lists = viewPointMapper.findAllByFood();
                break;
            case 3:
                lists = viewPointMapper.findAllByArView();
                break;
            case 4:
                lists = viewPointMapper.findAllByHotel();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + flag);
        }
        return lists;
    }

    @Override
    public Result search(String viewName) {
        Result result = new Result();
        ViewPoint viewPoints = viewPointMapper.findByName(viewName);
        if(viewPoints == null){
            result.setData(null);
            result.setJudge(false);
            result.setMes("失败");
            return result;
        }
        List<ViewFood> viewFoods = viewFoodMapper.findByViewId(viewPoints.getViewId());
        List<ViewHotel> viewHotels = viewHotelMapper.findByViewId(viewPoints.getViewId());
        List<ViewRouter> viewRouters = viewRouterMapper.findByViewId(viewPoints.getViewId());
        List<SurroundView> surroundViews = surroundViewMapper.findByViewId(viewPoints.getViewId());
        Map<String,Object> map = new HashMap<>();
        map.put("view",viewPoints);
        map.put("viewFood",viewFoods);
        map.put("viewHotel",viewHotels);
        map.put("viewRouter",viewRouters);
        map.put("surroundView",surroundViews);
        result.setData(map);
        result.setJudge(true);
        result.setMes("yep");
        return result;
     }
}
