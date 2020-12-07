package org.example.commonsample.designpattern.decorator.v1;

/**
 * @Description: BattercakeDecorator
 * @Author: gedachao
 * @Date: 2020-11-05 9:54
 * @Version 1.0
 */
public abstract class BattercakeDecorator extends Battercake {
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
