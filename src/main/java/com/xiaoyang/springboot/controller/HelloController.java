package com.xiaoyang.springboot.controller;

import com.xiaoyang.springboot.pojo.Person;
import org.springframework.web.bind.annotation.*;

/**
 * @auther XiaoYang
 * @DATE 2022/10/17-14:06
 */
@RestController
public class HelloController {

    @GetMapping("/user")
    public String getUser(){
        return "GET -> 张三";
    }

    @PostMapping("/user")
    public String saveUser(){
        return "POST -> 张三";
    }

    @PutMapping("/user")
    public Person updateUser(){
        return new Person("XIAOYANG",18);
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE -> 张三";
    }

}
