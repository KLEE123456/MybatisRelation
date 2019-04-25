package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.UserMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Orders;
import com.klee.MybatisRelation.pojo.Product;
import com.klee.MybatisRelation.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void  findUserMessageTest(){
        SqlSession sqlSession= MybatisUtils.getSqlSession(false);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findUserMessage();
        for (User user : userList) {
            System.out.println(user);
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
