create table weather_city
(
	column_1 int auto_increment,
	name varchar(128) null,
	code varchar(24) null,
	constraint weather_city_pk
		primary key (column_1)
);