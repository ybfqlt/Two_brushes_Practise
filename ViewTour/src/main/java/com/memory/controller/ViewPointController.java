package com.memory.controller;

import com.memory.dto.Result;
import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.SurroundView;
import com.memory.pojo.ViewFood;
import com.memory.pojo.ViewHotel;
import com.memory.pojo.ViewPoint;
import com.memory.service.FoodService;
import com.memory.service.HotelService;
import com.memory.service.SurroundViewService;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private SurroundViewService surroundViewService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private ViewStatisticMapper viewStatisticMapper;

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
    @GetMapping("/search")
    public Result getSearch(@RequestParam("viewName") String viewName){
        Result res = viewPointService.search(viewName);
        return res;
    }


    //景点详情
    @RequestMapping(value="/viewInfo",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> view(int viewId){
        HashMap<String,Object> map=new HashMap<>();
        ViewPoint view=viewPointService.findById(viewId);
        List<SurroundView> surroundViews=surroundViewService.findByViewId(viewId);
        List<ViewFood> foods= foodService.findByViewId(viewId);
        List<ViewHotel> hotels= hotelService.findByViewId(viewId);
        map.put("view",view);
        map.put("surroundViews",surroundViews);
        map.put("foods",foods);
        map.put("hotels",hotels);
        return map;
    }

    //增加
    @RequestMapping(value="/viewAdd",method=RequestMethod.POST)
    public void  insert(ViewPoint viewPoint, HttpServletRequest request, HttpServletResponse response) throws Exception {
        viewPointService.insert(viewPoint);    //用result接收的时候返回值是1表示插入成功，返回是0表示插入失败
        //自增的id已经注入到bean中了  通过getViewId()获取即可
        //每增加一个景点 就在view_statistic这个表增加一个view_id
        viewStatisticMapper.insert(viewPoint.getViewId());
        request.getRequestDispatcher("../static/view/list_view.jsp").forward(request,response);
        //前端让在跳转页面时已经进行重新请求
    }

    //修改时先获取单个景点的详情   异步请求
    @RequestMapping(value="/viewDetails",method=RequestMethod.GET )
    @ResponseBody
    public ViewPoint edit(int viewId){
        ViewPoint view =viewPointService.findById(viewId);
        return view;
    }

    //修改
    @RequestMapping(value="/viewModify",method=RequestMethod.POST)
    public ModelAndView update(ViewPoint viewPoint){
        ModelAndView modelAndView=new ModelAndView("redirect:../static/view/modify_view.jsp");
        viewPointService.update(viewPoint);
        //请求转发   必须重新查询        前端需要页面重新加载
        return modelAndView;
    }

    //删除
    @RequestMapping(value="/viewDelete",method=RequestMethod.GET )
    public  ModelAndView  delete(@RequestParam("viewId") int viewId){
        viewPointService.delete(viewId);
        viewStatisticMapper.deleteById(viewId);
        //请求转发   必须重新查询          前端需要页面重新加载
        ModelAndView modelAndView=new ModelAndView("redirect:../static/view/modify_view.jsp");
        return modelAndView;
    }
}
