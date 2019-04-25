package com.klee.MybatisRelation.test;


import com.github.pagehelper.PageHelper;
import com.klee.MybatisRelation.mapper.ProductMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Category;
import com.klee.MybatisRelation.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;


public class ProductTest {
    @Test
    public  void insertProductsTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        for (int i=0;i<100;i++){
            Product product=new Product();
            product.setName("product"+i);
            product.setPrice(100+i);
            product.setCid(1);
            productMapper.insertProducts(product);
        }
        System.out.println("-------产品记录添加成功!--------");
        MybatisUtils.closeSqlSession(sqlSession);
    }
    @Test
    public void  findProductByPageTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession(false);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        //分页,(写在查询方法之前)
        PageHelper.startPage(2,10);
        //PageHelper<Product> pageHelper=new PageHelper()
        List<Product> productList = productMapper.listProduct();
        productList.forEach(product -> {
            System.out.print(product);
            Category category = product.getCategory();
            System.out.println(","+category);
        });
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
