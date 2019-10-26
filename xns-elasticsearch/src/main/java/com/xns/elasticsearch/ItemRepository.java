package com.xns.elasticsearch;

import com.xns.elasticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Classname ItemRepository
 * @Description TODO
 * @Date 19-10-26 下午8:45
 * @Created by xns
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
    List<Item> findByTitle(String title);

    List<Item> findByPriceBetween(Double d1,Double d2);
}
