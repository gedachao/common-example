package org.example.commonsample.controller;

import lombok.Data;
import org.example.commonsample.annotation.Autowired;
import org.example.commonsample.service.UserService;

/**
 * @Description: UserController
 * @Author: gedachao
 * @Date: 2020-11-04 15:51
 * @Version 1.0
 */
@Data
public class UserController {
    @Autowired
    private UserService userService;
}
