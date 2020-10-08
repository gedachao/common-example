package org.example.commonsample.proxy;

import org.example.commonsample.proxy.factory.UsbKingFactory;
import org.example.commonsample.proxy.handler.SellHandler;

import java.lang.reflect.Proxy;

/**
 * @Description: ProxyDemo
 * @Author: gedachao
 * @Date: 2020-10-08 14:31
 * @Version 1.0
 */
public class ProxyDemo {
    public static void main(String[] args) {
        UsbSell factory = new UsbKingFactory();
        SellHandler handler = new SellHandler(factory);
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        float res = proxy.sell(20);
        System.out.println(res);

    }
}
