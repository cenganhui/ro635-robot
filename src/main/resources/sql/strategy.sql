create table strategy
(
    id       int auto_increment
        primary key,
    plate_id int          null,
    title    varchar(256) null,
    url      varchar(256) null
);
INSERT INTO strategy (plate_id, title, url) VALUES (1, '我想要入坑这游戏怎么样啊？', 'https://bbs.nga.cn/read.php?tid=21273052');
INSERT INTO strategy (plate_id, title, url) VALUES (1, '新人快速推图', 'https://bbs.nga.cn/read.php?tid=18105241');
INSERT INTO strategy (plate_id, title, url) VALUES (2, '前进营地玩法', 'https://bbs.nga.cn/read.php?tid=18042373');