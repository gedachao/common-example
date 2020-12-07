package org.example.commonsample.proxy.proxy1;

import org.example.commonsample.proxy.proxy1.factory.UsbKingFactory;
import org.example.commonsample.proxy.proxy1.handler.SellHandler;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Description: ProxyDemo
 * @Author: gedachao
 * @Date: 2020-10-08 14:31
 * @Version 1.0

 * Returns an instance of a proxy class for the specified interfaces
 * that dispatches method invocations to the specified invocation
 * handler.
 *
 * <p>{@code Proxy.newProxyInstance} throws
 * {@code IllegalArgumentException} for the same reasons that
 * {@code Proxy.getProxyClass} does.
 *
 * @param   loader the class loader to define the proxy class
 * @param   interfaces the list of interfaces for the proxy class
 *          to implement
 * @param   h the invocation handler to dispatch method invocations to
 * @return  a proxy instance with the specified invocation handler of a
 *          proxy class that is defined by the specified class loader
 *          and that implements the specified interfaces
 *
 *
 * */
public class ProxyDemo {
    public static void main(String[] args) {
        UsbSell factory = new UsbKingFactory();
        SellHandler handler = new SellHandler(factory);
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        float res = proxy.sell(20);
        System.out.println(res);

    }
    @Test
    public void test(){
        System.out.println("hello");
        System.out.println("他喵了个米的发涩发额");

    }
}
