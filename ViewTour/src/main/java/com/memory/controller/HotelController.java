package com.memory.controller;

import com.memory.dto.Result;
import com.memory.pojo.ViewHotel;
import com.memory.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @Classname HotelController
 * @Description TODO
 * @Date 19-11-30 上午10:45
 * @Created by xns
 */
@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;


    /**
     * 获取住宿列表
     * @param viewId
     * @return
     */
    @GetMapping("/hotelList")
    public Map<String,Object> getRouters(@RequestParam("viewId")Integer viewId){
       Map<String,Object> map = hotelService.getHotel(viewId);
        return map;
    }


    /**
     * 增加住宿
     * @param viewHotel
     * @return
     */
    @PostMapping("/hotelAdd")
    public ModelAndView addhotel(ViewHotel viewHotel){
        Result res = hotelService.addHotel(viewHotel);
        ModelAndView modelAndView = new ModelAndView("redirect:static/hotel/around_hotel.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 根据住宿id获取住宿信息
     * @param hotelId
     * @return
     */
    @GetMapping("/hotelDetails")
    public ViewHotel gethotel(@RequestParam("hotelId") Integer hotelId){
        ViewHotel viewHotel = hotelService.getOneHotel(hotelId);
        return viewHotel;
    }

    /**
     * 修改住宿信息
     * @param viewHotel
     * @return
     */
    @PostMapping("/hotelModify")
    public ModelAndView modifyHotel(ViewHotel viewHotel){
        Result res = hotelService.modifyHotel(viewHotel);
        ModelAndView modelAndView = new ModelAndView("redirect:static/hotel/hotel_details.jsp");
        modelAndView.addObject(res);
        return modelAndView;
    }

    /**
     * 删除某住宿
     * @param hotelId
     */
    @GetMapping("/hotelDelete")
    public Result deleteHotel(@RequestParam("hotelId") Integer hotelId){
        Result res = hotelService.deleteHotel(hotelId);
        return res;
    }
}
