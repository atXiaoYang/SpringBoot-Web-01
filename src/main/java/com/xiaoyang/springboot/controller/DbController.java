package com.xiaoyang.springboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-db")
    public String testDb() {
        try {
            Integer count = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "✅ DB Connected! Result: " + count;
        } catch (Exception e) {
            return "❌ DB Error: " + e.getMessage();
        }
    }
}