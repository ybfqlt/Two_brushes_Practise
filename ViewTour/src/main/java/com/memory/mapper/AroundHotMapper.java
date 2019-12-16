package com.memory.mapper;

import com.memory.pojo.AroundHot;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AroundHotMapper {

    //查询周边所有
     List<AroundHot> findAll();
}
