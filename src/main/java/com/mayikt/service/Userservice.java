package com.mayikt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Userservice {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入数据到User表
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age){
        int update = jdbcTemplate.update("insert into users VALUES(null, ?, ?)", userName, age);
        return update > 0? "success": "fail";
    }
}
