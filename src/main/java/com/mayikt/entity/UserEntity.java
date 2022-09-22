package com.mayikt.entity;


import com.mayikt.Application;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;


//相当于@Getter和@Setter，在class文件中自动生成get和set方法，可以直接调用
@Data
//打印日志直接添加注解
@Slf4j
public class UserEntity {
    /*@Getter
    @Setter*/
    private String userName;
    private Integer age;

    //每个项目默认添加无参构造函数
    public UserEntity(){

    }

    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "UserEntity{" +
//                "userName='" + userName + '\'' +
//                ", age=" + age +
//                '}';
//    }
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(22);
        userEntity.setUserName("mayikt");
        System.out.println(userEntity.getUserName());
        log.info("username");
    }

}
