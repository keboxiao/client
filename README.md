Springcloud 客户端DEMO
使用数据库为ORACLE
建表语句：
create table t_user(
id int not null,
name varchar(8) not null,
gender varchar2(2) not null,
age int not null,
address varchar2(20) default '地址不详' not null,
regdata date
);