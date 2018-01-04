drop database if exists shop;

create database if not exists shop;
use shop;

drop table if exists user;
create table user(
user_id int not null primary key auto_increment,
user_name varchar(32),
user_pass varchar(32),
user_email varchar(50),
user_address varchar(50),
user_gender varchar(32),
user_born varchar(32),
user_date datetime
);

drop table if exists item;
create table item(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);


INSERT INTO item(item_name, item_price, item_stock) VALUES("メロン", 2000, 50);
INSERT INTO item(item_name, item_price, item_stock) VALUES("なし", 300, 50);