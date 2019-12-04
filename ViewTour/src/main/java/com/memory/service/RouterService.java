package com.memory.service;

import com.memory.dto.Result;
import com.memory.pojo.ViewRouter;

import java.util.List;
import java.util.Map;

/**
 * @Classname RouterService
 * @Description TODO
 * @Date 19-11-30 上午10:47
 * @Created by xns
 */
public interface RouterService {

    /**
     * 增加路线
     * @param viewId
     * @param routerLine
     * @return
     */
    Result addRouter(Integer viewId,String routerLine);

    /**
     * 获取所有路线
     * @param viewId
     * @return
     */
    Map<String,Object> getRouter(Integer viewId);

    /**
     * 修改路线
     * @param viewRouter
     * @return
     */
    Result modifyRouter(ViewRouter viewRouter);

    /**
     * 删除某路线
     * @param routerId
     * @return
     */
    Result deleteRouter(Integer routerId);

    /**
     * 根据路线id获取某路线信息
     * @param routerId
     * @return
     */
    ViewRouter getOneRouter(Integer routerId);
}
