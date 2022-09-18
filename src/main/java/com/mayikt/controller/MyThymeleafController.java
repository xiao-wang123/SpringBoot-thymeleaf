package com.mayikt.controller;

import com.mayikt.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MyThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request, Map<String, Object> result){
        //request.setAttribute("user", new UserEntity("mayikt",22));
        result.put("user", new UserEntity("mayikt",22));
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("mayikt1",22));
        userEntities.add(new UserEntity("mayikt2",22));
        userEntities.add(new UserEntity("mayikt3",22));
        result.put("userList",userEntities);
        return "myThymeleaf.html";
    }
}
