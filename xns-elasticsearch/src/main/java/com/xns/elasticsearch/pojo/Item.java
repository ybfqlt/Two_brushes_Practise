package com.xns.elasticsearch.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Classname item
 * @Description TODO
 * @Date 19-10-26 下午4:15
 * @Created by xns
 */
@Data
@Document(indexName = "item",type = "docs",shards = 1,replicas = 0)
public class Item {
    @Id
    Long id;
    /**
     * 标题
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    String title;
    /**
     * 分类
     */
    @Field(type = FieldType.Keyword)
    String category;
    /**
     * 品牌
     */
    @Field(type = FieldType.Keyword)
    String brand;
    /**
     * 价格
     */
    @Field(type = FieldType.Double)
    Double price;
    /**
     * 图片地址
     */
    @Field(type = FieldType.Keyword,index = false)
    String images;

    public Item(Long id, String title, String category, String brand, Double price, String images) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.images = images;
    }
}
