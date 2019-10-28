package com.xns.elasticsearch;

import com.xns.elasticsearch.pojo.Item;
import lombok.var;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.elasticsearch.search.aggregations.metrics.avg.InternalAvg;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
       nativeSearchQuery.withQuery(QueryBuilders.matchQuery("category", "手机"));

        /**
         * 添加分页条件，页码是从0开始的
         */
//        nativeSearchQuery.withPageable(PageRequest.of(1,2));
        /**
         * 查出的结果为降序排列
         */
        nativeSearchQuery.withSort(SortBuilders.fieldSort("price").order(SortOrder.DESC));
        /**
         * 执行查询获取分页结果集，不分页，默认为一页
         */
       Page<Item> search = this.itemRepository.search(nativeSearchQuery.build());
       System.out.println(search.getTotalPages());
       System.out.println(search.getTotalElements());
       search.getContent().forEach(System.out::println);
    }

    @Test
    public void testAggs(){
        //初始化自定义查询构建器
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        //添加聚合
        queryBuilder.addAggregation(AggregationBuilders.terms("brandAgg").field("brand"));
        //添加结果集过滤,不包括任何字段
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));
        //执行聚合查询
        AggregatedPage<Item> search = (AggregatedPage<Item>)this.itemRepository.search(queryBuilder.build());
        //解析聚合结果集,根据聚合的类型以及字段类型要进行强转,brand-是字符串类型的，聚合类型-词条聚合,brandAgg-通过聚合名称获取聚合对象
        StringTerms brandAgg = (StringTerms)search.getAggregation("brandAgg");
        //获取桶的集合
        List<StringTerms.Bucket> buckets = brandAgg.getBuckets();
        buckets.forEach(bucket->{
            System.out.println(bucket.getKeyAsString());
            System.out.println(bucket.getDocCount());
        });
    }

    @Test
    public void testSubAggs(){
        //初始化自定义查询构建器
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        //添加聚合
        queryBuilder.addAggregation(AggregationBuilders.terms("brandAgg").field("brand").subAggregation(AggregationBuilders.avg("price_avg").field("price")));
        //添加结果集过滤,不包括任何字段
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{},null));
        //执行聚合查询
        AggregatedPage<Item> search = (AggregatedPage<Item>)this.itemRepository.search(queryBuilder.build());
        //解析聚合结果集,根据聚合的类型以及字段类型要进行强转,brand-是字符串类型的，聚合类型-词条聚合,brandAgg-通过聚合名称获取聚合对象
        StringTerms brandAgg = (StringTerms)search.getAggregation("brandAgg");
        //获取桶的集合
        List<StringTerms.Bucket> buckets = brandAgg.getBuckets();
        buckets.forEach(bucket->{
            System.out.println(bucket.getKeyAsString());
            System.out.println(bucket.getDocCount());
            //获取子聚合的map集合,key-聚合名称,value-对应的子聚合对象
            Map<String, Aggregation> stringAggregationMap = bucket.getAggregations().asMap();
            InternalAvg price_avg = (InternalAvg)stringAggregationMap.get("price_avg");
            System.out.println(price_avg.getValue());
        });
    }
}
