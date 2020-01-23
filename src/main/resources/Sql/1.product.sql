create database Products_Ms;
use Products_Ms;
create table Product(
id bigint auto_increment not null primary key,
pid varchar(200) not null,
product_code bigint not null,
product_type varchar(50) not null
);