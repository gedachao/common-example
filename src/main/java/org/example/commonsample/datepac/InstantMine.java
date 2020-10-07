package org.example.commonsample.datepac;

import org.junit.Test;

import java.time.*;
import java.util.Date;
import java.util.Set;

/**
 * @Description: InstantMine jdk8新引入的日期类,表示时间戳
 * @Author: gedachao
 * @Date: 2020-10-07 10:04
 * @Version 1.0
 */
public class InstantMine {
    @Test
    public void test1() {
        Instant instant = Instant.now();
        System.out.println(instant);
        // 时间戳, 即从1970至今相差的毫秒数
        System.out.println(instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());
        // 获取instant
        Instant instant1 = Instant.ofEpochMilli(1602036443047L);
        // 计算两个instant之间相差毫秒数
        System.out.println(Duration.between(instant1, instant).toMillis());
        // 添加减少时间
        Instant instant2 = instant.plusMillis(1000L);

    }

    /**
     * 时区ZoneId
     */
    @Test
    public void test2() {
        // 获取系统支持的所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String id : availableZoneIds) {
            System.out.println(id);
        }
        System.out.println(ZoneId.systemDefault().toString());
    }

    /**
     * Date,Instant,LocalDateTime的转换
     */
    @Test
    public void test3() {
        // Date ---> Instant ---> LocalDateTime
        Date date = new Date();
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime);

        // LocalDateTime ---> Instant ---> Date
        Instant instant1 = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date from = Date.from(instant1);
        System.out.println(from);


    }


}
