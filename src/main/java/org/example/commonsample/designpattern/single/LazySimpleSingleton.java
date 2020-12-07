package org.example.commonsample.designpattern.single;

/**
 * 懒汉单例模式,
 * 存在线程安全问题, 解决方法是可以在 getInstance() 方法上直接加锁synchronized;
 * 即 public synchronized static LazySimpleSingleton getInstance() {...}
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    private static LazySimpleSingleton lazy = null;
    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
