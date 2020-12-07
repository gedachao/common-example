package org.example.commonsample.designpattern.observer.v1;

import java.util.Observable;

/**
 * @Description: Gper
 * @Author: gedachao
 * @Date: 2020-11-05 13:53
 * @Version 1.0
 */
public class Gper extends Observable {
    private String name = "Gper生态";
    private static Gper gper;

    public static Gper getInstance() {
        if (gper == null) {
            gper = new Gper();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publicQuestion(Question question) {
        System.out.println(question.getUserName() + " 在" + this.name + " 上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
