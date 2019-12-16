package com.memory.mapper;

import com.memory.pojo.ViewRouter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
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

    //对应减1
    int decrease(@Param("viewId") Integer viewId,@Param("flag") Integer flag);

    //将增加的景点id插入到view_statistic表中
    void insert(int viewId);
    //删除这个景点
    void deleteById(int viewId);
    //查询此时view_statistic里的ar_view_count的值
    int findByArCount(int viewId);
    //如果添加一个周边景点就ar_count_view++   如果删除一个周边景点ar_view_count--
    void update(@Param("count") int count, @Param("viewId") int viewId);
    //查询food_count  周边美食的个数
    int findByFood(int viewId);
    //查询hotel_count  周边住宿的个数
    int findByHotel(int viewId);
    //查询所有的id
    List<Integer> findById();
}
