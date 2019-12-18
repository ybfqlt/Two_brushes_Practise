package com.memory.service.impl;

import com.memory.dto.Result;
import com.memory.mapper.ViewHotelMapper;
import com.memory.mapper.ViewPointMapper;
import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.ViewHotel;
import com.memory.pojo.ViewPoint;
import com.memory.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname HotelServiceImpl
 * @Description TODO
 * @Date 19-11-30 上午10:48
 * @Created by xns
 */
@Service("HotelService")
public class HotelServiceImpl implements HotelService {

    @Autowired
    ViewHotelMapper viewHotelMapper;

    @Autowired
    ViewPointMapper viewPointMapper;

    @Autowired
    ViewStatisticMapper viewStatisticMapper;

    /**
     * 添加住宿
     *
     * @param viewHotel
     * @return
     */
    @Override
    public Result addHotel(ViewHotel viewHotel) {
        if (viewHotelMapper.insert(viewHotel) != 0) {
            viewStatisticMapper.increse(viewHotel.getViewId(),4);
            return new Result(true, "添加成功", null);
        } else {
            return new Result(false, "添加失败", null);
        }
    }

    /**
     * 获取所有住宿
     *
     * @param viewId
     * @return
     */
    @Override
    public Map<String, Object> getHotel(Integer viewId) {
        Map<String, Object> map = new HashMap<>();
        List<ViewHotel> lists = viewHotelMapper.findByViewId(viewId);
        ViewPoint viewPoint = viewPointMapper.findById(viewId);
        map.put("viewName", viewPoint.getViewName());
        map.put("hotel", lists);
        return map;
    }

    /**
     * 修改
     *
     * @param viewHotel
     * @return
     */
    @Override
    public Result modifyHotel(ViewHotel viewHotel) {
        if (viewHotelMapper.update(viewHotel) != 0) {
            viewHotel = viewHotelMapper.findById(viewHotel.getHotelId());
            return new Result(true, "修改成功", viewHotel);
        } else {
            viewHotel = viewHotelMapper.findById(viewHotel.getHotelId());
            return new Result(false, "修改失败", viewHotel);
        }
    }

    /**
     * 删除住宿
     *
     * @param HotelId
     * @return
     */
    @Override
    public Result deleteHotel(Integer HotelId) {
        ViewHotel viewHotel = viewHotelMapper.findById(HotelId);
        if (viewHotelMapper.delete(HotelId) != 0) {
            viewStatisticMapper.decrease(viewHotel.getViewId(),4);
            return new Result(true, "删除成功", null);
        } else {
            return new Result(false, "删除失败", null);
        }
    }

    /**
     * 根据住宿id返回住宿信息
     *
     * @param HotelId
     * @return
     */
    @Override
    public ViewHotel getOneHotel(Integer HotelId) {
        return viewHotelMapper.findById(HotelId);
    }

    @Override
    public List<ViewHotel> findByViewId(int viewId) {
        return  viewHotelMapper.findByViewId(viewId);
    }

    @Override
    public int findByCount() {
        return viewHotelMapper.findByCount();
    }
}
