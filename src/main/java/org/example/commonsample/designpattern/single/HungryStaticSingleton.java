package org.example.commonsample.designpattern.single;

/**
 * 饿汉单例模式, 实现方式2;
 * 利用静态代码块的机制
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
