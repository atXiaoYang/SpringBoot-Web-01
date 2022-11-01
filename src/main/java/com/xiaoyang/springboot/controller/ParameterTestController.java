package com.xiaoyang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther XiaoYang
 * @DATE 2022/10/17-16:11
 */
@RestController
public class ParameterTestController {

    // /car/1/owner/zhangsan
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,Object> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,Object> headers,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters") List<String> inters,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("Pycharm-bbc5b262") String cookie,
                                     @CookieValue("Pycharm-bbc5b262") Cookie cookies){
        Map<String,Object> map = new HashMap<>();
//        map.put("id",id);
//        map.put("username",username);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",headers);
//        map.put("age",age);
//        map.put("inters",inters);
//        map.put("params",params);
        map.put("Pycharm-bbc5b262",cookie);
        map.put("cookies",cookies);

        return map;
    }



    @PostMapping("/save")
    public Map postMethod(@RequestBody String context){
        Map<String,Object> map = new HashMap<>();
        map.put("context",context);
        return map;
    }

}
