package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.ProductMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ManyToOneTest {
    /**
     * 多对一测试方法
     */
    @Test
    public void  listProductTest(){
        SqlSession sqlSession= MybatisUtils.getSqlSession(false);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        List<Product> products = productMapper.listProduct();
        System.out.println("-------------多对一查询---------------");
        for (Product product : products) {
            System.out.println(product+","+product.getCategory());
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
