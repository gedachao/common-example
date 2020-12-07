package org.example.commonsample.designpattern.decorator.v1;

/**
 * @Description: BaseBattercake
 * @Author: gedachao
 * @Date: 2020-11-05 9:49
 * @Version 1.0
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
