package org.example.commonsample.designpattern.decorator.v1;

import org.junit.Test;

/**
 * @Description: DecoratorTest
 * @Author: gedachao
 * @Date: 2020-11-05 10:00
 * @Version 1.0
 */
public class DecoratorTest {
    @Test
    public void test() {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake = new EggBattercakeDecorator(battercake);
        battercake = new EggBattercakeDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + " , 总价格：" + battercake.getPrice());


    }
}
