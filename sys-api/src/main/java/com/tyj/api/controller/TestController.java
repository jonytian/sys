package com.tyj.api.controller;

import com.tyj.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tyj on 2019/03/01.
 */
@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("hello")
    public String hello(){
        return "Hello Boot-JPA";
    }


}
