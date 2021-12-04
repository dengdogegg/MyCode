package com.myStudy.day1121;

import org.junit.Test;
import sun.util.resources.LocaleData;

import java.util.Date;
import java.util.Locale;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName JDK8Time.java
 * @Description 测试JDK8以后的时间API
 * @createTime 2021年11月21日 14:53:00
 */
public class JDK8Time {
    @Test
    public void Test() {
        //时间偏移量，年需要减去1900，月份从0开始
        Date date = new Date(2021-1900, 11-1, 20);
        System.out.println("date = " + date);
        /**
         * Java8提供新的jar
         * java.time基础包
         * java.time.chrono提供不同日历系统的访问
         * java.time.format格式化和解析时间和日期
         * java.time.temporal包含底层框架和扩展性
         * java.time.zone逝去的支持类
         */



    }
}
