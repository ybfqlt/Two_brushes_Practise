package com.memory.service.impl;

import com.memory.mapper.SurroundViewMapper;
import com.memory.pojo.SurroundView;
import com.memory.service.SurroundViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SurroundViewServiceImpl implements SurroundViewService {


    @Autowired
    private SurroundViewMapper surroundViewMapper;

    @Override
    public List<SurroundView> findByViewId(int viewId) {

        return surroundViewMapper.findByViewId(viewId);
    }

    @Override
    public void insert(SurroundView surroundView)
    {
        surroundViewMapper.insert(surroundView);
    }


    @Override
    public void update(SurroundView surroundView) {
           surroundViewMapper.update(surroundView);
    }

    @Override
    public void delete(int arViewId) {
           surroundViewMapper.delete(arViewId);
    }

    @Override
    public SurroundView findByArViewId(int arViewId) {
        return  surroundViewMapper.findByArViewId(arViewId);
    }

    @Override
    public int findByCount() {
        return surroundViewMapper.findByCount();
    }

    @Override
    public int findId(Integer arViewId) {
        return  surroundViewMapper.findId(arViewId);
    }
}
