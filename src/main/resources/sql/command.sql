create table command
(
    id   int auto_increment
        primary key,
    name varchar(128) null,
    constraint command_name_uindex
        unique (name)
);
INSERT INTO command (name) VALUES ('ro');
INSERT INTO command (name) VALUES ('rd');
INSERT INTO command (name) VALUES ('mute');
INSERT INTO command (name) VALUES ('qfi');
INSERT INTO command (name) VALUES ('qeq');
INSERT INTO command (name) VALUES ('qfa');
INSERT INTO command (name) VALUES ('pic');
INSERT INTO command (name) VALUES ('wea');
INSERT INTO command (name) VALUES ('攻略');
INSERT INTO command (name) VALUES ('相关攻略');