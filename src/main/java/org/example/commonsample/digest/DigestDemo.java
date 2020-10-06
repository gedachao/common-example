package org.example.commonsample.digest;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

/**
 * @Description: DigestDemo
 * @Author: gedachao
 * @Date: 2020-09-23 14:12
 * @Version 1.0
 */
public class DigestDemo {
    @Test
    public void test1() {
        String string = DigestUtils.md5Hex("我有一只小毛驴");
        System.out.println(string);
    }
}
