package org.example.commonsample.datepac;

import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Description: JDKDateDemo
 * @Author: gedachao
 * @Date: 2020-09-22 15:14
 * @Version 1.0
 */
public class JDKDateDemo {
    @Test
    public void test1(){
//        String date = DateFormat.getDateInstance(DateFormat.FULL, Locale.US).format(new Date());
        String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US).format(new Date());
        System.out.println(date);
    }
}
