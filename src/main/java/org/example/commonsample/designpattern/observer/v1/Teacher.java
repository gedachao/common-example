package org.example.commonsample.designpattern.observer.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: Teacher
 * @Author: gedachao
 * @Date: 2020-11-05 14:03
 * @Version 1.0
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question) arg;
        System.out.println("----------------------------->");
        System.out.println(name + "老师你好!\n " + "你收到了一个来自" + gper.getName() + "的提问, 希望你解答, 问题内容如下：\n" + question.getContent() + "\n提问者：" + question.getUserName());
    }
}
