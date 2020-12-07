package org.example.commonsample.designpattern.single;

/**
 * 饿汉单例模式
 * 在类加载的时候就初始化, 并创建单例对象；绝对的线程安全
 * 方式1
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
