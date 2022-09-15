package com.mayikt.controller;

import com.mayikt.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request){
        request.setAttribute("user", new UserEntity("mayikt",22));
        return "myThymeleaf";
    }
}
