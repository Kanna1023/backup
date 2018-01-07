drop database if exists test_ec;

create database if not exists test_ec;
use test_ec;


create table if not exists user_info(
id int not null primary key auto_increment,
user_id varchar(16) not null unique,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0 not null,
email varchar(32) not null,
status tinyint default 0 not null,
logined tinyint default 0 not null,
regist_date datetime not null,
update_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
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


INSERT INTO item_info_transaction(item_name, item_price, item_stock) VALUES("NoteBook", 100, 50);
