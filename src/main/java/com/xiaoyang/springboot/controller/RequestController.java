package com.xiaoyang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther XiaoYang
 * @DATE 2022/10/17-16:48
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gotoPage(Model model){
        model.addAttribute("msg","成功了...");
        model.addAttribute("code",200);
        return "forward:/success";  //转发到   /success请求
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code){
        Map<String,Object> map = new HashMap<>();
        map.put("msg",msg);
        map.put("code",code);
        return map;
    }


    //  /cars/sell;low=34;brand=byd,audi,yd
    //      手动开启 : 原理 -> 对路径的处理。UrlPathHelper进行解析。
    //              RemoveSemicolonContent（移除分号内容）是可以支持矩阵变量的(默认是true不支持)
    @ResponseBody
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brands,
                        @PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brands",brands);
        map.put("path",path);
        return map;
    }


    //  /boss/1;age=20/2;age=10
    @ResponseBody
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        Map<String,Object> map = new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;
    }
    
}
