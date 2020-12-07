package org.example.commonsample.proxy.proxy2;

public class CrossFire implements IGame {
    @Override
    public void play(String game) {
        System.out.println("I am playing "+ game);
    }
}
