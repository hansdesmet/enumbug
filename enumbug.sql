set names utf8mb4;
set charset utf8mb4;

drop database if exists enumbug;

create database enumbug charset utf8mb4;
use enumbug;

create table person (
	id int auto_increment primary key,
    name varchar(50),
    gender varchar(50)
);

insert into person(name, gender) values ('Noah','MALE'), ('Mia','FEMALE');



create user if not exists enumbug identified by 'enumbug';
grant select on  person to enumbug;