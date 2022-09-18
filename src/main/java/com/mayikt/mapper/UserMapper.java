package com.mayikt.mapper;

import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into users values(null, )")
    int insertUser();
}
