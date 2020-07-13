package com.lightmatter.mappers.mapper;

import com.lightmatter.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {


    User getUserById(@Param("id") int id);

    void insertOne(@Param("user") User user);
}
