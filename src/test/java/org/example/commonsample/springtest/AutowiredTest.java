package org.example.commonsample.springtest;

import org.example.commonsample.annotation.Autowired;
import org.example.commonsample.controller.UserController;
import org.example.commonsample.service.UserService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description: AutowiredTest
 * @Author: gedachao
 * @Date: 2020-11-04 15:53
 * @Version 1.0
 */
public class AutowiredTest {
    @Test
    public void test() {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        UserService userService = new UserService();
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            String name = field.getName();
            System.out.println("field name:" + name);
            Autowired annotation = field.getAnnotation(Autowired.class);
            if (annotation != null) {
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object object = type.newInstance();
                    field.set(userController, userService);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        });
        if (userController.getUserService() != null) {
            System.out.println(userController.getUserService());
            userController.getUserService().query();
        }


    }

    @Test
    public void test2() {

    }
}
