package org.example.commonsample.datepac;

import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;


/**
 * @Description: DateDemo
 * @Author: gedachao
 * @Date: 2020-09-22 14:01
 * @Version 1.0
 */
public class DateDemo {
    final static FastDateFormat FAST_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
    @Test
    public void test1() throws ParseException {
        Date date = new Date();
        System.out.println("原格式："+date);
        String format_date = FAST_DATE_FORMAT.format(date);
        System.out.println("format_date:"+format_date);

        Date date_from_parse = FAST_DATE_FORMAT.parse(format_date);
        System.out.println(date_from_parse);


    }


}
