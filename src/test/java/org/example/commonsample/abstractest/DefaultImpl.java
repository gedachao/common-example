package org.example.commonsample.abstractest;

/**
 * @Description: DefaultImpl
 * @Author: gedachao
 * @Date: 2020-12-07 12:37
 * @Version 1.0
 */
public class DefaultImpl extends AbsParent {
    @Override
    protected void abstractDelete() {
        System.out.println("DefaultImpl ------ AbstractDelete ");
    }
}
