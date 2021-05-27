# QQ机器人 RO635
## 使用simple-robot开发的QQ机器人

## 目前的功能
- 互动
- 人形、装备、妖精的建造查询
- 图图
- 天气预报
- 欢迎新成员
- 私聊群发更新信息
- 聊天
- 私聊群发图片

## 部分命令
```bash
# 日常互动
@RO ro

#聊天
@RO [xxxx]

# 计算概率
# xxxx？正在为您计算......概率为25%，有点低呢。/50%，不是很高呢。/75%，好像还不错？/100%，很高啊。
@RO rd [xxxx]

# 禁言（暂未实现）
# 细数你的罪行吧！/嫌疑人，休想得逞！/正义，是不会输的！xxx禁言n分钟。
@RO mute @xxx n(min)

# 查询人形建造
# 了解，正在为您查询......
# 时间 名称 星级 类型 是否重建
# 0:20 | M1911 | 2 | 手枪 | 否
@RO qfi x:xx

# 查询装备建造
# 了解，正在为您查询......
# 时间 装备名称 级别 装备类型
# 5 | BM 3-12x40 | 白 | 光学瞄具
@RO qeq xx

# 查询妖精建造
# 了解，正在为您查询......
# 时间 妖精名称
# 3:00 | 遁甲妖精
@RO qfa x:xx

# 来个图图
# 虽然是一件十分讨厌的事，但还是请您好好享受。
@RO pic

# 天气预报
@RO wea 城市名称

# 私聊群发更新信息
update [图片]

# 私聊群发图片
pic [描述] [图片]

# 少女前线相关攻略板块
@RO 相关攻略

# 攻略
@RO 攻略 板块名称
```

## 资料
- simple-robot：https://github.com/ForteScarlet/simpler-robot
- simple-robot文档：https://www.yuque.com/simpler-robot/simpler-robot-doc
- 高德开放平台：https://lbs.amap.com/api/webservice/guide/api/weatherinfo
- 天行机器人：https://www.tianapi.com/apiview/47#apiprice
- 少女前线nga：https://bbs.nga.cn/thread.php?fid=-547859
