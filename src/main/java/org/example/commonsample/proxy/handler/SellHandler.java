package org.example.commonsample.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: SellHandler
 * @Author: gedachao
 * @Date: 2020-10-08 14:49
 * @Version 1.0
 */
public class SellHandler implements InvocationHandler {
    // 目标对象
    private Object target;

    public SellHandler(Object target) {
        this.target = target;
    }

    // 完成代理类的功能：调用目标方法,增强功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(target, args);
        if (res != null) {
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }
        return res;
    }
}
