package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewFood;
import com.memory.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Classname FoodController
 * @Description TODO
 * @Date 19-11-30 上午10:45
 * @Created by xns
 */
@RestController
public class FoodController {

    @Autowired
    FoodService foodService;


    /**
     * 获取美食列表
     * @param viewId
     * @return
     */
    @GetMapping("/foodList")
    public Map<String,Object> getFoods(@RequestParam("viewId")Integer viewId){
        Map<String,Object> map = foodService.getFood(viewId);
        return map;
    }


    /**
     * 增加美食
     * @param viewFood
     * @return
     */
    @PostMapping("/foodAdd")
    public ModelAndView addFood(ViewFood viewFood){
        Result res = foodService.addFood(viewFood);
        ModelAndView modelAndView = new ModelAndView("redirect:static/food/around_foods.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 根据美食id获取美食信息
     * @param foodId
     * @return
     */
    @GetMapping("/foodDetails")
    public ViewFood getFood(@RequestParam("foodId") Integer foodId){
        ViewFood viewFood = foodService.getOneFood(foodId);
        return viewFood;
    }

    /**
     * 修改美食信息
     * @param viewFood
     * @return
     */
    @PostMapping("/foodModify")
    public ModelAndView modifyFood(ViewFood viewFood){
        Result res = foodService.modifyFood(viewFood);
        ModelAndView modelAndView = new ModelAndView("redirect:static/food/food_details.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 删除某美食
     * @param foodId
     */
    @GetMapping("/foodDelete")
    public Result deleteFood(@RequestParam("foodId") Integer foodId){
        Result res = foodService.deleteFood(foodId);
        return res;
    }

    @GetMapping("/foodDetails")
    public ViewFood foodDetails(@RequestParam("foodId")Integer foodId){
        ViewFood viewFood = foodService.getOneFood(foodId);
        return viewFood;
    }
}
