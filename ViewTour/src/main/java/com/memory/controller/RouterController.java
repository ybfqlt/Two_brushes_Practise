package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewRouter;
import com.memory.service.RouterService;
import com.memory.service.impl.RouterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname RouterController
 * @Description TODO
 * @Date 19-11-30 上午10:44
 * @Created by xns
 */
@RestController
public class RouterController {

    @Autowired
    RouterService routerService;


    /**
     * 获取路线列表
     * @param viewId
     * @return
     */
    @GetMapping("/routerList")
    public Map<String,Object> getRouters(@RequestParam("viewId")Integer viewId){
       Map<String,Object> map = routerService.getRouter(viewId);
        return map;
    }

    /**
     * 增加路线
     * @param viewRouter
     * @return
     */
    @PostMapping("/routerAdd")
    public ModelAndView addRouter(ViewRouter viewRouter){
        Result res = routerService.addRouter(viewRouter);
        ModelAndView modelAndView = new ModelAndView("redirect:static/router/router_curd.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 修改前获取路线信息
     * @param routerId
     * @return
     */
    @GetMapping("/routerDetails")
    public ViewRouter getRouter(@RequestParam("routerId") Integer routerId){
        ViewRouter list = routerService.getOneRouter(routerId);
        return list;
    }

    /**
     * 修改路线信息
     * @param viewRouter
     * @return
     */
    @PostMapping("/routerModify")
    public ModelAndView modifyRouter(ViewRouter viewRouter){
        Result res = routerService.modifyRouter(viewRouter);
        ModelAndView modelAndView = new ModelAndView("redirect:static/router_curd_details.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 删除某路线
     * @param routerId
     */
    @GetMapping("/routerDelete")
    public Result deleteRouter(@RequestParam("routerId") Integer routerId){
        Result res = routerService.deleteRouter(routerId);
        return res;
    }
}
