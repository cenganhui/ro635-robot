create table figurine_produce
(
	id int auto_increment,
	time varchar(16) null,
	name varchar(64) null,
	level int null,
	type varchar(16) null,
	heavy int null,
	constraint figurine_produce_pk
		primary key (id)
);
# 初始化
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:20', 'M1911', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:20', '纳甘左轮', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:20', 'P38', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:22', 'PPK', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:25', 'MP-446', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:25', 'FNP-9', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:28', 'USP Compact', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:28', 'Bren Ten', 2, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:30', 'C96', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:30', 'P08', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:35', '92式', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:35', 'P99', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:40', '阿斯特拉左轮', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:40', '马卡洛夫', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:40', 'M9', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:45', '托卡列夫', 3, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:49', '杰里科', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:50', '柯尔特左轮', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:50', 'Mk23', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:50', 'P30', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:52', 'Spitfire', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:53', 'K5', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:54', 'Rex Zero 1', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:55', '斯捷奇金', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('0:55', 'P7', 4, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:00', '维尔德MkⅡ', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:02', '竞争者', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:04', 'Px4 风暴', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:05', 'M950A', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:05', 'NZ75', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:09', 'C-93', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:10', '灰熊MkⅤ', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:10', 'PP-2000', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:10', 'IDW', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:15', 'PA-15', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:20', 'm45', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:20', 'Spectre M4', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:25', '64式', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:30', '伯莱塔38型', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:30', 'M3', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:30', 'MP-40', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:35', 'HP-35', 5, '手枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:40', '司登MkⅡ', 3, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:40', '微型乌兹', 3, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:50', 'PPSh-41', 2, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('1:50', 'F1', 3, '冲锋枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:00', 'MAC-10', 3, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:00', '蝎式', 3, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:05', 'Z-62', 3, '冲锋枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:10', 'PPS-43', 3, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:10', 'PPD-40', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:10', 'SAF', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:15', 'UMP9', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:15', 'UMP45', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:16', 'AR-57', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:18', '希普卡', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:18', 'PP-19-01', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:18', 'MP7', 5, '冲锋枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:19', '樱花', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:20', 'MP5', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:20', 'PP-90', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:20', 'KAC-PDW', 4, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:25', '索米', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:28', 'C-MS', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:29', 'P90', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:30', '汤姆森', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:30', 'G36C', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:33', 'SR-3MP', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:35', 'Vector', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:35', '79式', 5, '冲锋枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:40', 'SIG-510', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:40', '加利尔', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:45', 'F2000', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:45', '63式', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:50', 'G3', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('2:50', 'L85A1', 2, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:00', 'StG44', 3, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:10', 'OTs-12', 3, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:10', 'FN-49', 2, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:10', 'G43', 2, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:15', 'ARX-160', 3, '突击步枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:20', 'AK-47', 3, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:20', 'FNC', 3, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:20', 'BM59', 2, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:25', '56-1式', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:25', 'XM8', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:25', 'SAR-21', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:30', 'AS Val', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:30', 'FAMAS', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:30', 'TAR-21', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:30', '西蒙诺夫', 2, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:30', 'SVT-38', 2, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:35', '9A-91', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:35', 'EM-2', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:35', 'CR-21', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:40', 'G36', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:40', '利贝罗勒', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:40', 'FX-05', 4, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:40', 'SV-98', 3, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:40', 'M14', 3, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:45', 'FAL', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:48', 'T91', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:50', '95式', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:50', '97式', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:50', '汉阳造88式', 3, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:50', 'OTs-44', 3, '步枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:52', 'K2', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:53', 'MDR', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:55', 'HK416', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:55', 'ADS', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:56', 'SIG-556', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:56', 'AK-Alfa', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:56', 'SIG MCX', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('3:58', 'RFB', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:00', 'M1加兰德', 3, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:04', '四式', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:04', 'G11', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:05', 'G41', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:05', 'Zas M21', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:06', '64式自', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:08', '89式自', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:08', 'S-ACR', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:09', 'AN-94', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:10', '莫辛-纳甘', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:10', 'T-5000', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:11', 'K11', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:12', 'AK-12', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:15', 'AK-15', 5, '突击步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:15', 'SVD', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:15', 'SPR A3G', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:15', 'K31', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:20', 'PSG-1', 4, '步枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:20', 'G28', 4, '步枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:25', '春田', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:25', '塔布克', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:30', 'PTRD', 4, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:30', 'PzB39', 4, '步枪', 1);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:32', 'M200', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:38', '卡尔卡诺M1891', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:40', 'Kar98k', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:42', '卡尔卡诺M91/38', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:43', 'VSK-94', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:45', 'NTW-20', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:47', 'SVCh', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:48', 'QBU-88', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:50', 'WA2000', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:50', 'AAT-52', 2, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:50', 'FG42', 2, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:52', 'IWS 2000', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('4:55', 'M99', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:00', '李-恩菲尔德', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:00', '德利尔', 5, '步枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:00', 'MG34', 2, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:00', 'DP28', 2, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:10', 'LWMMG', 2, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:20', '布伦', 3, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:40', 'M1919A4', 3, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('5:50', 'MG42', 3, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:10', 'M2HB', 3, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:10', 'M60', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:15', '80式', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:16', 'RPK-16', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:16', 'RPK-203', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:20', 'MK48', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:0', 'AKE-999', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:25', 'M1918', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:25', '阿梅利', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:25', '绍沙', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:26', 'ZB-26', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:28', '88式', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:30', 'MG3', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:30', 'PK', 4, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:35', '内格夫', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:36', 'MG36', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:40', 'MG4', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:45', 'MG5', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('6:50', 'PKP', 5, '机枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:11', 'V-PM5', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:14', 'M1014', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:15', 'NS2000', 3, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:20', 'M500', 3, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:25', 'KS-23', 3, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:30', 'RMB-93', 3, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:30', 'M1897', 3, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:40', 'M590', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:40', 'SPAS-12', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:45', 'M37', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:45', '解放者', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:50', 'Super-Shorty', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:55', 'USAS-12', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('7:56', 'HK512', 4, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:00', 'KSG', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:05', 'Saiga-12', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:06', 'FP-6', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:08', 'M6 ASW', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:10', 'S.A.T.8', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:12', 'AA12', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:13', 'DP-12', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:15', 'CAWS', 5, '霰弹枪', 0);
INSERT INTO figurine_produce (time, name, level, type, heavy) VALUES ('8:17', 'LTLX7000', 5, '霰弹枪', 0);