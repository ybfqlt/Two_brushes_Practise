package com.memory.controller;

import com.memory.mapper.AroundHotMapper;
import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.AroundHot;
import com.memory.pojo.ViewPoint;
import com.memory.service.FoodService;
import com.memory.service.HotelService;
import com.memory.service.SurroundViewService;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
@RequestMapping("/tour")
public class IndexController {

    @Autowired
    private ViewPointService viewPointService;
    @Autowired
    private SurroundViewService surroundViewService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private ViewStatisticMapper viewStatisticMapper;
    @Autowired
    private AroundHotMapper aroundHotMapper;


    @RequestMapping(value="/index",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> index(){
        HashMap<String,Object> map=new HashMap<>();
        int viewNumber=viewPointService.findByCount();
        int aroundNumber=surroundViewService.findByCount()+ foodService.findByCount()+ hotelService.findByCount();
        map.put("viewNumber",viewNumber);
        map.put("aroundNumber",aroundNumber);
        //景点热度根据周边个数排序
        List<Integer> list1=viewStatisticMapper.findById();
        List<Integer> count1=new ArrayList<>();//存放所有的周边数
        for(int i=0;i<list1.size();i++) {
            count1.add(viewStatisticMapper.findByArCount(list1.get(i)) + viewStatisticMapper.findByFood(list1.get(i)) + viewStatisticMapper.findByHotel(list1.get(i)));
        }
        //根据周边个数从大到小排序  根据view_id在view_point表里查询景点所有信息
        List<Integer>  list2 = new ArrayList<>();
        List<Integer>  count2= new ArrayList<>();
        int de;
        int m= 0;
        Iterator<Integer> it = count1.iterator();
        while(it.hasNext())
        {
            de = 0;
            for(int j = 0; j < count1.size(); j ++)
            {
                if(count1.get(de) < count1.get(j))
                {
                    de = j;
                }
            }
            count2.add(m,count1.get(de));
            count1.remove(de);
            list2.add(m,list1.get(de));
            list1.remove(de);
            m++;
        }
        list1= list2;
        count1 = count2;
        //此时 list2中存放按照周边个数从大到小排序的view_id的集合
        List<ViewPoint> views=new ArrayList<>();
        for(int k=0;k<list2.size();k++) {
            //views.add(viewPointService.findById(list2.get(k)));
            ViewPoint viewPoint=new ViewPoint();
            //根据viewId查询图片
            viewPoint.setViewImg(viewPointService.findByImg(list2.get(k)));
            //根据viewId查询viewName
            viewPoint.setViewName(viewPointService.findByName(list2.get(k)));
            //根据viewId查询地理位置
            viewPoint.setViewAddress(viewPointService.findByAddress(list2.get(k)));
            //根据viewId查询类型
            viewPoint.setViewType(viewPointService.findByType(list2.get(k)));
            //根据viewId查找周边总数
            viewPoint.setViewNumber(viewStatisticMapper.findByArCount(list2.get(k))+viewStatisticMapper.findByHotel(list2.get(k))+viewStatisticMapper.findByFood(list2.get(k)));
            views.add(viewPoint);
        }
        map.put("viewHot",views);

        //周边热度从周边景点、周边住宿和周边美食选前两个组成一个数组
          List<AroundHot>  aroundHot=aroundHotMapper.findAll();
          map.put("aroundHot",aroundHot);
          return map;
    }

}
