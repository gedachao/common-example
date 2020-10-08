package org.example.commonsample.proxy.factory;

import org.example.commonsample.proxy.UsbSell;

/**
 * @Description: UsbKingFactory 目标类
 * @Author: gedachao
 * @Date: 2020-10-08 14:48
 * @Version 1.0
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中,执行sell目标方法");
        return 85.0f;
    }
}
