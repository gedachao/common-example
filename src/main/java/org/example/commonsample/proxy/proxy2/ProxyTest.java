package org.example.commonsample.proxy.proxy2;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test(){
        CrossFire crossFire = new CrossFire();
        IGame instance = (IGame) new GameProxy().getInstance(crossFire);
        instance.play("crossfire");

    }
    @Test
    public void test2(){
        CrossFire crossFire = new CrossFire();
        IGame instance = (IGame) new CgLibGameProxy().getInstance(crossFire.getClass());
        instance.play("cross");


    }
}
