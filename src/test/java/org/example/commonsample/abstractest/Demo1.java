package org.example.commonsample.abstractest;

import org.example.commonsample.domain.DefaultPersonSupport;
import org.example.commonsample.domain.Lucy;
import org.example.commonsample.domain.Mike;
import org.example.commonsample.util.PersonSupport;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: Demo1
 * @Author: gedachao
 * @Date: 2020-11-19 14:54
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Mike mike = new Mike();
        Lucy lucy = new Lucy();
        mike.addName("mike", "nol1");
        mike.addName("mike2", "nol2");
        mike.getAllCacheName();
        System.out.println("----------");
        lucy.addName("lucy", "nol2");
        lucy.getAllCacheName();


    }

    @Test
    public void test() {
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        map.computeIfAbsent("name", key -> "jdc");

    }

    @Test
    public void test1() {
        BigDecimal b1 = new BigDecimal(8987);
        BigDecimal b2 = new BigDecimal(346);
        BigDecimal b3 = new BigDecimal(278);
        BigDecimal b4 = new BigDecimal(278);
        BigDecimal b5 = new BigDecimal(8897);
        List<BigDecimal> decimals = Arrays.asList(b1, b2, b3, b4, b5);
        Optional<BigDecimal> min = decimals.stream().min(BigDecimal::compareTo);
        BigDecimal bigDecimal = min.get();
        System.out.println(bigDecimal);

    }

    @Test
    public void test2() {
        ConcurrentHashMap<String, Integer> goods = new ConcurrentHashMap<>();
        goods.put("shoes", 100);
        goods.put("cloth", 150);
        goods.put("hat", 300);
        System.out.println("之前的map:");
        System.out.println(goods);
        Integer glassesPrice = goods.computeIfAbsent("hat", key -> 400);
        System.out.println(glassesPrice);
        System.out.println("之后的map:");
        System.out.println(goods);

    }
}
