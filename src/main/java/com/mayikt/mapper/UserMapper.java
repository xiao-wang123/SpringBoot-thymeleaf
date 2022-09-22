package com.mayikt.mapper;

import com.mayikt.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


//定义一个接口
public interface UserMapper {

    @Insert("insert into users values(null, #{username}, #{age})")
    int insertUser(@Param("username") String username, @Param("age") Integer age);

    @Select("select id as id, name as username, age as age from users where id = #{id}")
    UserEntity selectByUserId(@Param("id") Integer id);


}
