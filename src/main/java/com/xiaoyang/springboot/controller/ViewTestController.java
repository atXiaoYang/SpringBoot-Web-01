package com.xiaoyang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auther XiaoYang
 * @DATE 2022/10/17-20:26
 */
@Controller
public class ViewTestController {

    @GetMapping("/xiaoyang")
    public String xiaoyang(Model model){
        model.addAttribute("msg","你好，xiaoyang!");
        model.addAttribute("link","www.baidu.com");
        return "success";
    }

}
