package org.example.commonsample.datepac;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description: DateTimeFormatterMine
 * @Author: gedachao
 * @Date: 2020-10-07 11:58
 * @Version 1.0
 */
public class DateTimeFormatterMine {
    private static final Logger logger = LoggerFactory.getLogger(DateTimeFormatterMine.class);

    private static final String DATA_TIME_STYLE = "yyyy-MM-dd HH:mm:ss";

    @Test
    public void test() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATA_TIME_STYLE);
        // 格式化
        String time = formatter.format(LocalDateTime.now());
        System.out.println(time);
        // 将字符串转为日期格式
        LocalDateTime localDateTime = LocalDateTime.parse(time, formatter);
        System.out.println(localDateTime);
    }

}
