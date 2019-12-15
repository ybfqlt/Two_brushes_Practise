package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewPoint;
import com.memory.service.RouterService;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname ViewPointController
 * @Description TODO
 * @Date 19-11-30 上午11:20
 * @Created by xns
 */
@RestController
@RequestMapping("/tour")
public class ViewPointController {

    @Autowired
    ViewPointService viewPointService;

    @GetMapping("/viewList")
    public List<ViewPoint> getRouter(@RequestParam("flag") Integer flag){
        List<ViewPoint> lists = viewPointService.getAllView(flag);
        return lists;
    }

    /**
     * 查询
     * @param viewName
     * @return
     */
    @PostMapping("/search")
    public Result getSearch(String viewName){
        Result res = viewPointService.search(viewName);
        return res;
    }
}
