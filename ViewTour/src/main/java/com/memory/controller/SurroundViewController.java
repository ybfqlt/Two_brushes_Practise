package com.memory.controller;

import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.SurroundView;
import com.memory.service.SurroundViewService;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/tour")
public class SurroundViewController {

    @Autowired
    private SurroundViewService  surroundViewService;
    @Autowired
    private ViewStatisticMapper viewStatisticMapper;
    @Autowired
    private ViewPointService viewPointService;


    /*
        根据viewId查询所有的周边景点
     */
    @RequestMapping(value="/arViewList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findAll(int viewId){
        HashMap<String,Object> map=new HashMap<>();
        List<SurroundView> surroundViewList=surroundViewService.findByViewId(viewId);
        String viewName=viewPointService.findByName(viewId);
        map.put("arView",surroundViewList);
        map.put("viewName",viewName);
        return  map;
    }

     /*
         为指定viewId的景点增加周边景点
      */
      @RequestMapping(value = "/arViewAdd",method = RequestMethod.POST)
       public  ModelAndView insert(SurroundView surroundView)  {
          surroundViewService.insert(surroundView);
          //查询此时view_statistic里面的ar_view_count的值
          int count=viewStatisticMapper.findByArCount(surroundView.getViewId());
          //在对应的景点的周边景点数++
          viewStatisticMapper.update(count+1,surroundView.getViewId());
          ModelAndView modelAndView=new ModelAndView("redirect:../static/around_view/around_view_details.jsp?viewId="+surroundView.getViewId());
            return modelAndView;
            }

       /*
           异步请求  修改之前首先查询单个周边景点
        */

        @RequestMapping("/arViewDetails")
        @ResponseBody
       public SurroundView edit(int arViewId){
               SurroundView surroundView= surroundViewService.findByArViewId(arViewId);
                return  surroundView;
        }


       @RequestMapping("/arViewModify")
       public  ModelAndView   update(SurroundView surroundView){
            //通过arViewId查找viewId
            int viewId=surroundViewService.findId(surroundView.getArViewId());
            ModelAndView modelAndView=new ModelAndView("redirect:../static/around_view/around_view_details.jsp?viewId="+viewId);
            surroundViewService.update(surroundView);
            return  modelAndView;

       }

       /*
           删除   需要知道ar_view_id和view_id
        */
       @RequestMapping("/arViewDelete")
       @ResponseBody
       public Map<String,Object>  delete(int viewId,int arViewId){
           surroundViewService.delete(arViewId);
           //查询此时view_statistic里面的ar_view_count的值
           int count=viewStatisticMapper.findByArCount(viewId);
           //在对应的景点的周边景点数--
           viewStatisticMapper.update(count-1,viewId);
           HashMap<String,Object> map=new HashMap<>();
           map.put("success","111");
           return map;

       }
}
