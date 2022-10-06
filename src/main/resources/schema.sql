drop table if exists t_a;
create table t_a(
    id int auto_increment primary key,
    name varchar(10) not null
);
create table t_b(
    id int auto_increment primary key,
    a_id int,
    name varchar(10) not null
);
create table t_c(
    id int auto_increment primary key,
    a_id int,
    name varchar(10) not null
);