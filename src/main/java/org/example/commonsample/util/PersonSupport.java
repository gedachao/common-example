package org.example.commonsample.util;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: PersonSupport
 * @Author: gedachao
 * @Date: 2020-11-19 14:48
 * @Version 1.0
 */
public abstract class PersonSupport {
    private final Map<String, String> cacheNames = new ConcurrentHashMap<>(256);

    protected void addCacheName(String key, String value) {
        cacheNames.put(key, value);
    }

    public void getAllCacheName() {
        Set<Map.Entry<String, String>> entries = cacheNames.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
