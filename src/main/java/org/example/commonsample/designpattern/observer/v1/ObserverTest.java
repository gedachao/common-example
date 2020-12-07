package org.example.commonsample.designpattern.observer.v1;

import sun.awt.windows.ThemeReader;

/**
 * @Description: ObserverTest
 * @Author: gedachao
 * @Date: 2020-11-05 14:08
 * @Version 1.0
 */
public class ObserverTest {
    public static void main(String[] args) {
        Gper instance = Gper.getInstance();
        Teacher teacher = new Teacher("Tom");
        Question question = new Question();
        question.setUserName("jdc");
        question.setContent("how to cook");
        instance.addObserver(teacher);
        instance.publicQuestion(question);
    }
}
