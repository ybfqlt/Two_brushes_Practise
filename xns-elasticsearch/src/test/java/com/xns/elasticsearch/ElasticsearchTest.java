package com.xns.elasticsearch;

import com.xns.elasticsearch.pojo.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Classname ElasticsearchTest
 * @Description TODO
 * @Date 19-10-26 下午4:26
 * @Created by xns
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticsearchTest {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void testIndex(){
        this.elasticsearchTemplate.createIndex(Item.class);
        this.elasticsearchTemplate.putMapping(Item.class);
    }

    @Test
    public void testCreate(){
        Item item = new Item(1L,"小米手机8","手机","小米",3599.00,"http://image.nice.com/13123.jpg");
        this.itemRepository.save(item);


//        List<Item> list = new ArrayList<>();
//        list.add(new Item(2L,"坚果手机R1","手机","锤子",3699.00,"http://image.nice.com/3232.jpg"));
//        list.add(new Item(3L,"华为META10","手机","华为",4499.00,"http://image.nice.com/3232.jpg"));
//        this.itemRepository.saveAll(list);
    }

    @Test
    public void testFind(){
        Iterable<Item> items = this.itemRepository.findAll(Sort.by("price").descending());
        items.forEach(System.out::println);
    }
}
