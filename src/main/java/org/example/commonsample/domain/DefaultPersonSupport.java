package org.example.commonsample.domain;

import org.example.commonsample.util.PersonSupport;

/**
 * @Description: DefaultPersonSupport
 * @Author: gedachao
 * @Date: 2020-11-19 15:00
 * @Version 1.0
 */
public class DefaultPersonSupport extends PersonSupport {
    public void getAll() {
        getAllCacheName();
    }
}
