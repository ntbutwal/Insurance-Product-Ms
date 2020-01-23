create table Benefits(
id bigint not null auto_increment primary key,
Description varchar(400),
Product_id bigint,
foreign key(Product_id) references Product(id)
);