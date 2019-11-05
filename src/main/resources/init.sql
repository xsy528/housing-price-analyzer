/*
SQLyog Ultimate - MySQL GUI v8.2
MySQL - 5.5.27
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `web_form` (
	`w_id` double ,
	`w_web` varchar (48),
	`w_web_name` varchar (36),
	`w_first_web` varchar (216),
	`w_reliability` double ,
	`w_is_rhp` double
);
insert into `web_form` (`w_id`, `w_web`, `w_web_name`, `w_first_web`, `w_reliability`, `w_is_rhp`) values('1','https://hz.58.co','58同城','https://hz.58.com/chuzu/?utm_source=sem-sales-baidu-pc&spm=56414705433.1','3','0');
insert into `web_form` (`w_id`, `w_web`, `w_web_name`, `w_first_web`, `w_reliability`, `w_is_rhp`) values('2','https://hz.zu.an','安居客','https://hz.zu.anjuke.com/','1','0');
insert into `web_form` (`w_id`, `w_web`, `w_web_name`, `w_first_web`, `w_reliability`, `w_is_rhp`) values('3','https://hz.zu.fa','房天下','https://hz.zu.fang.com/','4','0');
insert into `web_form` (`w_id`, `w_web`, `w_web_name`, `w_first_web`, `w_reliability`, `w_is_rhp`) values('4','https://hz.5i5j.','我爱我家','https://hz.5i5j.com/zufang?pmf_group=baidu&pmf_medium=cpc&pmf_plan=%E7%A','5','0');
insert into `web_form` (`w_id`, `w_web`, `w_web_name`, `w_first_web`, `w_reliability`, `w_is_rhp`) values('5','http://hz.ziroom','自如网','http://hz.ziroom.com/z/nl/z2.html?utm_source=baidu&utm_medium=cpc&utm_te','4','0');

create table housing_form
(
	id int(12) auto_increment
		primary key,
	region varchar(8) not null,
	name varchar(24) not null,
	price float not null,
	prices float default 0 null,
	format varchar(12) null,
	area float not null,
	`desc` varchar(48) null,
	owner varchar(12) null,
	location varchar(36) not null,
	other varchar(24) null,
	is_rhp tinyint(1) not null,
	web_id int(2) not null
);

