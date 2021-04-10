create table equipment_produce
(
	id int auto_increment,
	time varchar(16) null,
	name varchar(64) null,
	level int null,
	type varchar(16) null,
	constraint equipment_produce_pk
		primary key (id)
);
# 初始化
INSERT INTO equipment_produce (time, name, level, type) VALUES ('5', 'BM 3-12×40', 1, '光学瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('7', 'AC1消音器', 1, '消音器');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('8', 'EOT 506', 1, '全息瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('9', 'PEQ-2', 1, '夜战装备');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('10', 'AMP COMPM2', 1, '红点瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('12', 'IOP T1外骨骼', 1, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('12', 'IOP X1外骨骼', 1, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('13', 'ILM空尖弹', 1, '状态弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('14', '#1猎鹿弹', 1, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('14', 'BK独头弹', 1, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('15', 'M61穿甲弹', 1, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('16', '破旧披风', 1, '伪装披风');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('18', 'FMJ高速弹', 1, '高速弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('20', 'LRA 2-12×50', 2, '光学瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('22', 'AC2消音器', 2, '消音器');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('23', 'EOT 512', 2, '全息瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('24', 'PEQ-5', 2, '夜战装备');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('25', 'AMP COMPM4', 2, '红点瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('26', '试制运算芯片', 2, '芯片');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('26', 'Tpye1防弹插板', 2, '防弹插板');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('27', 'IOP T2外骨骼', 2, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('27', 'IOP X2外骨骼', 2, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('28', 'ILM空尖弹', 2, '状态弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('29', '#0猎鹿弹', 2, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('29', 'FST独头弹', 2, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('30', 'M993穿甲弹', 2, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('31', '伪装披风', 2, '伪装披风');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('33', 'JSP高速弹', 2, '高速弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('34', 'RMR红点', 2, '备用瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('35', 'PSO-1', 3, '光学瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('37', 'AC3消音器', 3, '消音器');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('38', 'EOT 516', 3, '全息瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('39', 'PEQ-15', 3, '夜战装备');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('40', 'COG M150', 3, '红点瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('40', 'M33狙击弹', 3, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('41', '#1运算芯片', 3, '芯片');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('41', 'Type2防弹插板', 3, '防弹插板');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('42', 'IOP T3外骨骼', 3, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('42', 'IOP X3外骨骼', 3, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('43', 'ILM空尖弹', 3, '状态弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('44', '#00猎鹿弹', 3, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('44', 'WAD独头弹', 3, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('45', '#6鸟弹', 3, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('45', 'Mk169穿甲弹', 3, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('45', 'VFL 6-24×56', 4, '光学瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('46', '城市迷彩披风', 3, '伪装披风');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('47', 'IOP大容量弹链箱', 3, '弹链箱');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('47', 'AC4消音器', 4, '消音器');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('48', 'EOT 518', 4, '全息瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('48', 'JHP高速弹', 3, '高速弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('48', 'Mk900SLAP', 3, '特殊穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('49', 'RMR T2红点', 3, '备用瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('49', 'PEQ-16A', 4, '夜战装备');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('50', 'ITI MARS', 4, '红点瞄具');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('50', 'M1022狙击弹', 4, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('51', '#2运算芯片', 4, '芯片');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('51', 'Type3防弹插板', 4, '防弹插板');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('52', 'IOP T4外骨骼', 4, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('52', 'IOP X4外骨骼', 4, '外骨骼');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('53', 'ILM空尖弹', 4, '状态弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('54', '#000猎鹿弹', 4, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('54', 'SABOT独头弹', 4, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('55', '#7.5鸟弹', 4, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('55', 'Mk211高爆穿甲弹', 4, '穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('56', '热光学迷彩披风', 4, '伪装披风');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('57', '信号弹', 4, '状态弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('57', '霰弹用闪光弹', 4, '霰弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('57', 'IOP极限弹链箱', 4, '弹链箱');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('58', 'APCR高速弹', 4, '高速弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('58', 'Mk1000SLAP', 4, '特殊穿甲弹');
INSERT INTO equipment_produce (time, name, level, type) VALUES ('59', 'RMR T4红点', 4, '备用瞄具');