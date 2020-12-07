package org.example.commonsample.designpattern.single;

/**
 * 利用静态内部类的方式, 解决线程安全问题, 和synchronized锁的性能问题；
 * 如何解决反射破坏的单例？
 *      改变私有构造方法如下:
 *      private LazyInnerClassSingleton(){
 *         if (LazyHolder.LAZY != null) {
 *             throw new RuntimeException("不允许创建多个实例");
 *         }
 *     }
 * 如何解决序列化破坏单例?
 *      添加一个方法即可:
 *      private Object readResolve() {
 *         return LazyHolder.LAZY;
 *     }
 *
 *
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
