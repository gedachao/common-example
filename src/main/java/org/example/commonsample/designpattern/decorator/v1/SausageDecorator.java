package org.example.commonsample.designpattern.decorator.v1;

/**
 * @Description: SausageDecorator
 * @Author: gedachao
 * @Date: 2020-11-05 9:59
 * @Version 1.0
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
