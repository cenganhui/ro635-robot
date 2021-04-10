create table interactive_words
(
	id int auto_increment,
	words varchar(1024) null,
	constraint interactive_words_pk
		primary key (id)
);
# 初始化
# 指挥官，RO635正在待命，等候您的差遣。
# 指挥官，有任务吗？
# 嗯？哪里有问题？让我看一下。
# M16？......那家伙......今天要来？......啊不，说我不在这儿就好了......
# 快把这张可笑的照片拿掉吧！不就是游戏赢了我一次吗，下次我可不会放水了！
# SOPⅡ，不要在基地的走廊里玩百米冲刺了！还有15，不要以为我不知道你又在偷喝16留下的酒！宿舍守则都好好学习一下啊！
# 指挥官，您怎么脸色不太好看？电脑蓝屏了吗......不要紧，我很快就能修好。您先喝杯咖啡缓缓吧，文件一定都会完好无损的。
# 真是难得清闲的日子呢……没有人形的头被卡在奇怪的地方，没有逃出救助站的动物群，也没有棘手的紧急任务......反倒有些不习惯啊。
# 指挥官，您又熬夜加班了吗？等等，还有人形看着呢......好啦，看在您这么辛苦的份上，就让您这样抱一会吧。
# 女士进入会场的时候，应该像一只蝴蝶。轻巧，又优雅......不要吵，SOPⅡ。这是很严肃的场合......至少不要跑啊。
INSERT INTO interactive_words (words) VALUES ('指挥官，RO635正在待命，等候您的差遣。');
INSERT INTO interactive_words (words) VALUES ('指挥官，有任务吗？');
INSERT INTO interactive_words (words) VALUES ('嗯？哪里有问题？让我看一下。');
INSERT INTO interactive_words (words) VALUES ('M16？......那家伙......今天要来？......啊不，说我不在这儿就好了......');
INSERT INTO interactive_words (words) VALUES ('快把这张可笑的照片拿掉吧！不就是游戏赢了我一次吗，下次我可不会放水了！');
INSERT INTO interactive_words (words) VALUES ('SOPⅡ，不要在基地的走廊里玩百米冲刺了！还有15，不要以为我不知道你又在偷喝16留下的酒！宿舍守则都好好学习一下啊！');
INSERT INTO interactive_words (words) VALUES ('指挥官，您怎么脸色不太好看？电脑蓝屏了吗......不要紧，我很快就能修好。您先喝杯咖啡缓缓吧，文件一定都会完好无损的。');
INSERT INTO interactive_words (words) VALUES ('真是难得清闲的日子呢……没有人形的头被卡在奇怪的地方，没有逃出救助站的动物群，也没有棘手的紧急任务......反倒有些不习惯啊。');
INSERT INTO interactive_words (words) VALUES ('指挥官，您又熬夜加班了吗？等等，还有人形看着呢......好啦，看在您这么辛苦的份上，就让您这样抱一会吧。');
INSERT INTO interactive_words (words) VALUES ('女士进入会场的时候，应该像一只蝴蝶。轻巧，又优雅......不要吵，SOPⅡ。这是很严肃的场合......至少不要跑啊。');