package com.xns.elasticsearch;

import com.xns.elasticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Classname ItemRepository
 * @Description TODO
 * @Date 19-10-26 下午8:45
 * @Created by xns
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
}
