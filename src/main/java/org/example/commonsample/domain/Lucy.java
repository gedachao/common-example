package org.example.commonsample.domain;

import org.example.commonsample.util.PersonSupport;

/**
 * @Description: Lucy
 * @Author: gedachao
 * @Date: 2020-11-19 14:53
 * @Version 1.0
 */
public class Lucy extends PersonSupport {
    private String name;

    public Lucy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addName(String name, String value) {
        addCacheName(name, value);
    }

    public void getAll() {
        getAllCacheName();
    }
}
