package com.memory.service.impl;

import com.memory.dto.Result;
import com.memory.mapper.ViewPointMapper;
import com.memory.mapper.ViewRouterMapper;
import com.memory.mapper.ViewStatisticMapper;
import com.memory.pojo.ViewPoint;
import com.memory.pojo.ViewRouter;
import com.memory.service.RouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname RouterServiceImpl
 * @Description TODO
 * @Date 19-11-30 上午10:48
 * @Created by xns
 */
@Service("RouterService")
public class RouterServiceImpl implements RouterService {

    @Autowired
    ViewRouterMapper viewRouterMapper;

    @Autowired
    ViewPointMapper viewPointMapper;

    @Autowired
    ViewStatisticMapper viewStatisticMapper;

    /**
     * 添加路线
     * @param viewRouter
     * @return
     */
    @Override
    public Result addRouter(ViewRouter viewRouter) {
        if(viewRouterMapper.insert(viewRouter)!=0) {
            viewStatisticMapper.increse(viewRouter.getViewId(),1);
            return new Result(true, "添加成功", null);
        }else{
            return new Result(false,"添加失败",null);
        }
    }

    /**
     * 获取所有路线
     * @param viewId
     * @return
     */
    @Override
    public Map<String,Object> getRouter(Integer viewId) {
        Map<String,Object> map = new HashMap<>();
        List<ViewRouter> lists = viewRouterMapper.findByViewId(viewId);
        ViewPoint viewPoint = viewPointMapper.findById(viewId);
        map.put("viewName",viewPoint.getViewName());
        map.put("router",lists);
        return map;
    }

    /**
     * 修改
     * @param viewRouter
     * @return
     */
    @Override
    public Result modifyRouter(ViewRouter viewRouter) {
        if(viewRouterMapper.update(viewRouter)!=0) {
            viewRouter = viewRouterMapper.findByRouterId(viewRouter.getRouterId());
            return new Result(true, "修改成功", viewRouter);
        }else{
            viewRouter = viewRouterMapper.findByRouterId(viewRouter.getRouterId());
            return new Result(false,"修改失败",viewRouter);
        }
    }

    /**
     * 删除路线
     * @param routerId
     * @return
     */
    @Override
    public Result deleteRouter(Integer routerId) {
        ViewRouter viewRouter = viewRouterMapper.findByRouterId(routerId);
        if(viewRouterMapper.delete(routerId)!=0){
            viewStatisticMapper.decrease(viewRouter.getViewId(),1);
            return new Result(true,"删除成功",viewRouter);
        }
        else{
            return new Result(false,"删除失败",viewRouter);
        }
    }

    /**
     * 根据路线id返回路线信息
     * @param routerId
     * @return
     */
    @Override
    public ViewRouter getOneRouter(Integer routerId) {
        return viewRouterMapper.findByRouterId(routerId);
    }
}
