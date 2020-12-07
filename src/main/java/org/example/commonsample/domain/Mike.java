package org.example.commonsample.domain;

import org.example.commonsample.util.PersonSupport;

/**
 * @Description: Mike
 * @Author: gedachao
 * @Date: 2020-11-19 14:53
 * @Version 1.0
 */
public class Mike extends PersonSupport {
    private String name;

    public Mike() {
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
