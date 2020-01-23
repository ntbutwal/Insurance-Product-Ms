create table Coverage(
id bigint not null auto_increment primary key,
Unit varchar(10) not null,
Coverage double not null,
Benefit_id bigint,
foreign key(Benefit_id) references Benefits(id)
);
