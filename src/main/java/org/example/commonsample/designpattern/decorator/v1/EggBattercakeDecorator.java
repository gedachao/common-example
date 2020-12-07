package org.example.commonsample.designpattern.decorator.v1;

/**
 * @Description: EggBattercakeDecorator
 * @Author: gedachao
 * @Date: 2020-11-05 9:57
 * @Version 1.0
 */
public class EggBattercakeDecorator extends BattercakeDecorator {
    public EggBattercakeDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+鸡蛋1";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
