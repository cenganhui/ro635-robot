create table plate
(
    id    int auto_increment
        primary key,
    title varchar(256) null
);
INSERT INTO plate (title) VALUES ('新手攻略');
INSERT INTO plate (title) VALUES ('进阶攻略');