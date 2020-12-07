package org.example.commonsample.abstractest;

/**
 * @Description: AbsParent
 * @Author: gedachao
 * @Date: 2020-12-07 12:33
 * @Version 1.0
 */
public abstract class AbsParent {
    protected void query() {
        System.out.println("parent protected method");
    }

    protected abstract void abstractDelete();
}
