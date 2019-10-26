package com.xns.elasticsearch;

import com.xns.elasticsearch.pojo.Item;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
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

    @Test
    public void testFindByTitle(){
        List<Item> items = this.itemRepository.findByTitle("手机");
        items.forEach(System.out::println);
    }

    @Test
    public void testFindByPriceBetween(){
        List<Item> items = this.itemRepository.findByPriceBetween(3699d,4499d);
        items.forEach(System.out::println);
    }

    @Test
    public void indexList(){
        List<Item> list = new ArrayList<>();;
        list.add(new Item(1L,"小米手机7","手机","小米",3299.00,"http://image.nice.com/3232.jpg"));
        list.add(new Item(2L,"坚果手机R1","手机","锤子",3699.00,"http://image.nice.com/3232.jpg"));
        list.add(new Item(3L,"华为META10","手机","华为",4499.00,"http://image.nice.com/3232.jpg"));
        list.add(new Item(4L,"小米Mix2s","手机","小米",4299.00,"http://image.nice.com/3232.jpg"));
        list.add(new Item(5L,"荣耀V10","手机","华为",2799.00,"http://image.nice.com/3232.jpg"));
        itemRepository.saveAll(list);
    }


    @Test
    public void testSearch(){
        //通过查询构建器工具构建查询条件
        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("title", "手机");
        Iterable<Item> search = this.itemRepository.search(matchQueryBuilder);
        search.forEach(System.out::println);
    }

    /**
     * 自定义查询
     */
    @Test
    public void testNative(){
        /**
         * 构建子弟那个一查询构建器
         */
       NativeSearchQueryBuilder nativeSearchQuery = new NativeSearchQueryBuilder();
        /**
         * 添加基本的查询条件
         */
       nativeSearchQuery.withQuery(QueryBuilders.matchQuery("title", "手机"));
        /**
         * 执行查询获取分页结果集，不分页，默认为一页
         */
       Page<Item> search = this.itemRepository.search(nativeSearchQuery.build());
       System.out.println(search.getTotalPages());
       System.out.println(search.getTotalElements());
       search.forEach(System.out::println);
    }
}
