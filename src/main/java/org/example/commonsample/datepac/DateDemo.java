package org.example.commonsample.datepac;

import org.apache.commons.lang3.time.FastDateFormat;
import org.example.commonsample.domain.Dog;
import org.junit.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Description: DateDemo
 * @Author: gedachao
 * @Date: 2020-09-22 14:01
 * @Version 1.0
 */
public class DateDemo {
    public static final String DateStyle = "yyyy-MM-dd HH:mm:ss";
    final static FastDateFormat FAST_DATE_FORMAT = FastDateFormat.getInstance(DateStyle);

    @Test
    public void test1() throws ParseException {
        Date date = new Date();
        System.out.println("原格式：" + date);
        String format_date = FAST_DATE_FORMAT.format(date);
        System.out.println("format_date:" + format_date);

        Date date_from_parse = FAST_DATE_FORMAT.parse(format_date);
        System.out.println(date_from_parse);

    }

    @Test
    public void test2() throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(2000);
        Date date2 = new Date();

        long date1Time = date1.getTime();
        Date date = new Date(date1Time);
        System.out.println(date1Time);
        System.out.println("date1------------>" + date1);
        System.out.println("date------------>" + date);
    }

    /**
     * var = time1-time2;
     * var/1000/60/60/24=1;
     * 即var是time1和time2相差的毫秒值
     *
     * @throws ParseException
     */
    @Test
    public void test5() throws ParseException {
        String str1 = "2020-10-06";
        String str2 = "2020-10-07 08:55:53";
        Date date1 = FAST_DATE_FORMAT.parse(str1);
        Date date2 = FAST_DATE_FORMAT.parse(str2);
        System.out.println(date1);
        System.out.println(date2);
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        System.out.println("time1---->" + time1);
        System.out.println("time2---->" + time2);
        long var = time1 - time2;
        System.out.println("time1-time2---->" + var);


    }

    @Test
    public void test6() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cat", "lihua");
        System.out.println(hashMap.get("hell"));

    }

    @Test
    public void test7() {
        Dog dog = new Dog();
        dog.setName("pappy");
        Dog dog1 = new Dog();
        dog1.setName("happy");
        List<Dog> dogs = Arrays.asList(dog, dog1);
        dogs.stream().forEach((item) -> item.setAddress("wuxi"));
        for (Dog dog2 : dogs) {
            System.out.println(dog2.getAddress());

        }
    }

    @Test
    public void test8() {
        Doffine doffine = new Doffine();
        doffine.setName("jdc");
        List<String> list = doffine.getList();
        List<String> collect = list.stream().filter((item) -> item.length() > 2).collect(Collectors.toList());
        System.out.println(collect);
    }


}
