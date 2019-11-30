package com.memory.service.impl;

import com.memory.mapper.ViewPointMapper;
import com.memory.pojo.ViewPoint;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<ViewPoint> getAllView(Integer flag) {
        List<ViewPoint> lists;
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
    }
}
