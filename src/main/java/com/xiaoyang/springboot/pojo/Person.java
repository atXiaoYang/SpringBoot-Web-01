package com.xiaoyang.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther XiaoYang
 * @DATE 2022/10/26-22:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String username;
    private Integer age;
}
