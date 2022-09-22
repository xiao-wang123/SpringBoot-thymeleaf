package com.mayikt.service;

        import com.mayikt.entity.UserEntity;
        import com.mayikt.mapper.UserMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class Userservice {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    /**
     * 插入数据到User表
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age){
        int update = jdbcTemplate.update("insert into users VALUES(null, ?, ?)", userName, age);
        return update > 0? "success": "fail";
    }

    /**
     * mybatis 查询
     * @param id
     * @return
     */
    @RequestMapping("/mybatisfindbyId")
    public UserEntity mybatisfindbyId(Integer id){
        return userMapper.selectByUserId(id);

    }

    /**
     * 整合mybatis
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("/insertUserMybatis")
    public String insertUserMybatis(String username, Integer age){
        int insert = userMapper.insertUser(username, age);
        return insert > 0? "success": "fail";
    }
    /**
     * myIndex
     */
    @RequestMapping("/myIndex")
    public String myIndex(){
        return "myIndex11";
    }
}
