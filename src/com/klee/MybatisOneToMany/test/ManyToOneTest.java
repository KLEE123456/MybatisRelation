package com.klee.MybatisOneToMany.test;

import com.klee.MybatisOneToMany.mapper.ProductMapper;
import com.klee.MybatisOneToMany.mybatisutils.MybatisUtils;
import com.klee.MybatisOneToMany.pojo.Product;
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
    }
}
