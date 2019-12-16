use view_project;

drop table view_food;
#周边美食
create table view_food
(
    food_id           int primary key auto_increment comment 'id',
    view_id           int          not null comment '关联的景点id',
    food_name         varchar(300) not null comment '食品名称',
    food_price        int          not null comment '食物价格',
    food_distance     varchar(100) comment '距离景点',
    food_address      varchar(300) comment '食物所在具体地址',
    food_hot          varchar(300) comment '食物热度',
    food_desc         varchar(5000) comment '食物描述',
    food_chinese_name varchar(300) comment '食物的中文名称',
    food_locate       varchar(100) comment '产地',
    food_taste        varchar(100) comment '口味',
    food_origin       varchar(100) comment '起源',
    food_recommend    varchar(100) comment '推荐指数',
    food_img varchar (300) comment '食品图片'
);

drop table view_hotel;
#周边住宿
create table view_hotel
(
    hotel_id       int primary key auto_increment comment 'id',
    view_id        int not null comment '景点id',
    hotel_name     varchar(300) comment '住宿名字',
    hotel_price    int not null comment '价格',
    hotel_distance varchar(200) comment '距离景点',
    hotel_address  varchar(200) comment '住宿地址',
    hotel_score    varchar(200) comment '住宿评分',
    hotel_img varchar (300) comment '住宿图片'
);

drop table view_statistic;
#周边统计
create table view_statistic
(
    view_id int not null unique comment '景点id',
    router_count int default 0 comment '路线数量',
    food_count int default 0 comment '美食数量',
    hotel_count int default 0 comment '住宿数量',
    ar_view_count int default 0 comment '周边景点数量'
);

use view_project;

CREATE TABLE around_hot(
    id INT PRIMARY KEY AUTO_INCREMENT,
    around_name VARCHAR(200),
    around_address VARCHAR(200)

    );

INSERT INTO  around_hot(around_name,around_address)
SELECT  food_name,food_address FROM view_food LIMIT 2;

INSERT INTO  around_hot(around_name,around_address)
SELECT hotel_name,hotel_address FROM view_hotel LIMIT 2;

INSERT INTO around_hot(around_name,around_address)
SELECT  ar_view_name,ar_view_address FROM  surround_view LIMIT 2;
