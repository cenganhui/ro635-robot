create table fairy_produce
(
	id int auto_increment,
	time varchar(16) null,
	name varchar(64) null,
	constraint fairy_produce_pk
		primary key (id)
);
# 初始化
INSERT INTO fairy_produce (time, name) VALUES ('3:00', '遁甲妖精');
INSERT INTO fairy_produce (time, name) VALUES ('3:05', '护盾妖精');
INSERT INTO fairy_produce (time, name) VALUES ('3:10', '嘲讽妖精');
INSERT INTO fairy_produce (time, name) VALUES ('3:30', '狙击妖精');
INSERT INTO fairy_produce (time, name) VALUES ('3:35', '炮击妖精');
INSERT INTO fairy_produce (time, name) VALUES ('3:40', '空袭妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:00', '增援妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:05', '空降妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:10', '防御妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:15', '立盾妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:30', '勇士妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:35', '暴怒妖精');
INSERT INTO fairy_produce (time, name) VALUES ('4:40', '双生妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:00', '指挥妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:05', '搜救妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:10', '照明妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:15', '连击妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:30', '布雷妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:35', '火箭妖精');
INSERT INTO fairy_produce (time, name) VALUES ('5:30', '工事妖精');