package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> findUserMessage();
}
