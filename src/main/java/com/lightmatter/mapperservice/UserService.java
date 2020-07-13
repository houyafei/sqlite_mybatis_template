package com.lightmatter.mapperservice;


import com.lightmatter.dto.User;
import com.lightmatter.mappers.mapper.UserMapper;
import com.lightmatter.util.MybatisUtil;

public class UserService {

    private UserMapper userMapper;

    public UserService() {
//        MybatisUtil.getSession().getConnection();
        this.userMapper = MybatisUtil.getSession().getMapper(UserMapper.class);
    }

    public User getUser(int id){
        System.out.println("----------------" );
        System.out.println(userMapper.getUserById(id));
        User user = userMapper.getUserById(id);
        System.out.println(user);
        return user;
    }

    public void insertOne(User user){

    }
}
