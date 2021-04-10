package com.cgh.ro635bot;

/**
 * 常量类
 *
 * @author Akuma
 * @date 2021/4/6 15:00
 */
public abstract class Constants {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String CAL_RANDOM_WORDS1 = "？正在为您计算......概率为";
    public static final String CAL_RANDOM_WORDS2 = "%，有点低呢。";
    public static final String CAL_RANDOM_WORDS3 = "%，不是很高呢。";
    public static final String CAL_RANDOM_WORDS4 = "%，好像还不错？";
    public static final String CAL_RANDOM_WORDS5 = "%，很高啊。";

    public static final String EXPRESSION = "为什么会选择我，您一定有自己的理由，而我的信念也终于得到了您的认可，不过......能不能别靠得这么近，大家......大家都在看着呢......好害羞。";

    public static final String GOOD_MORNING = "早上好，指挥官。";

    public static final String QUERY_PRODUCE = "了解，正在为您查询......\n\n";
    public static final String QUERY_PRODUCE_FAIL = "抱歉指挥官，我没能找到。";

    public static final String RANDOM_PICTURE_WORDS1 = "虽然是一件十分讨厌的事，但还是请您好好享受。\n";
//    public static final String RANDOM_PICTURE_FILEPATH_PREFIX = "D:\\IdeaProjects\\TestPic\\";
    public static final String RANDOM_PICTURE_FILEPATH_PREFIX = "/home/ro635-bot-picture/random-picture/";

    public static final String WEATHER_CITY_NAME_QUERY_FAIL = "抱歉指挥官，城市名称可能有些问题。";

    public static final String WELCOME_NEW_MEMBER = "指挥官，欢迎您。初次见面，我是RO635，等待您的差遣。";

    public static final String HELP_TEXT = "# 基础指令\n\n" +
            "# 早上好\n" +
            "@RO 早\n" +
            "# 日常互动\n" +
            "@RO ro\n" +
            "# 计算概率\n" +
            "@RO rd xxx\n" +
            "# 查询人形建造\n" +
            "@RO qfi x:xx\n" +
            "# 查询装备建造\n" +
            "@RO qeq x\n" +
            "# 查询妖精建造\n" +
            "@RO qfa x:xx\n" +
            "# 图图\n" +
            "@RO pic\n" +
            "# 天气预报\n" +
            "@RO wea 城市名称";

    /**
     * 高德地图天气预报请求url
     */
    public static final String WEATHER_SERVICE_URL = "https://restapi.amap.com/v3/weather/weatherInfo?city=";

}
