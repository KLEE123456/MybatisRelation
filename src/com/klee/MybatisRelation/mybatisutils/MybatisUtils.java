package com.klee.MybatisRelation.mybatisutils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * mybatis公共类
 */
public class MybatisUtils {
    //SqlSession工厂
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 获取工厂对象
     * @return
     * @throws IOException
     */
        static {

        try {
           Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取SqlSession
     * @return
     * @throws IOException
     */
    public  static SqlSession getSqlSession(boolean flag) {
        SqlSession sqlSession = sqlSessionFactory.openSession(flag);//自动提交
        return  sqlSession;
    }

    /**
     * 关闭SqlSession
     * @throws IOException
     */
    public  static  void  closeSqlSession(SqlSession sqlSession)  {
        if (sqlSession!=null){
            sqlSession.close();
        }
    }
}
