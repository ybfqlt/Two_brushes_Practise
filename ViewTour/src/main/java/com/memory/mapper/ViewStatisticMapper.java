package com.memory.mapper;

import com.memory.pojo.ViewRouter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ViewStatisticMapper
 * @Description TODO
 * @Date 19-11-30 上午11:55
 * @Created by xns
 */
@Repository
public interface ViewStatisticMapper {

    //增加景点
    int insert(Integer viewId);

    //对应加１
    int increse(@Param("viewId") Integer viewId,@Param("flag") Integer flag);
}
