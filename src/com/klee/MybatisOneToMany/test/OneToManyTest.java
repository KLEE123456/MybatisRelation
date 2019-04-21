package com.klee.MybatisOneToMany.test;

import com.klee.MybatisOneToMany.mapper.CategoryMapper;
import com.klee.MybatisOneToMany.mybatisutils.MybatisUtils;
import com.klee.MybatisOneToMany.pojo.Category;
import com.klee.MybatisOneToMany.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToManyTest {
    /**
     * 一对多测试方法
     */
    @Test
    public void listCategoryTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        List<Category> categories = categoryMapper.listCategory();
        System.out.println("---------一对多查询-----------");
        for (Category category:categories) {
            System.out.println(category);
            List<Product> productList = category.getProductList();
            for (Product product:productList) {
                System.out.println("\t"+product);
            }
        }
    }
}
