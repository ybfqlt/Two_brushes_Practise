create database if not exists parc default character set utf8 collate utf8_general_ci;

use parc;

create table user(
    id int not null auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
)