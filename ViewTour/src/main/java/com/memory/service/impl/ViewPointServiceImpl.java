package com.memory.service.impl;

import com.memory.mapper.ViewPointMapper;
import com.memory.pojo.ViewPoint;
import com.memory.service.ViewPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<ViewPoint> lists = new ArrayList<>();
        switch (flag){
            case 1:
               lists = viewPointMapper.findAllByRouter();
               System.out.println(lists);
               break;
            case 2:
                lists = viewPointMapper.findAllByFood();
                System.out.println(lists);
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
}
