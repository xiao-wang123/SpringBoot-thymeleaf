package com.mayikt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyIndexService {
    @Value("${mayikt.username}")
    private String  username;

    @Value("${mayikt.age}")
    private Integer age;

    @RequestMapping("/getNameAndAge")
    public String getNameAndAge(){
        return username + "、" + age;
    }
}
