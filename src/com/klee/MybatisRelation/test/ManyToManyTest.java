package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.OrdersMapper;
import com.klee.MybatisRelation.mapper.ProductMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Orders;
import com.klee.MybatisRelation.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ManyToManyTest {
    /**
     * 订单查询测试方法(多对多关系)
     */
    @Test
    public  void  findOrdersTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> ordersList = ordersMapper.findOrders();
        for (Orders orders : ordersList) {
            System.out.println(orders);
            List<Product> productList = orders.getProductList();
            for (Product product : productList) {
                System.out.println("\t"+product);
            }
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }

    /**
     * 查询产品的测试方法（多对多）
     */
    @Test
    public  void  findProductTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession(false);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        List<Product> productList = productMapper.findProduct();
        for (Product product : productList) {
            System.out.println(product);
            List<Orders> ordersList = product.getOrdersList();
            for (Orders orders : ordersList) {
                System.out.println("\t"+orders);
            }
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
