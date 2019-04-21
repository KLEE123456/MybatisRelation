package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.OrdersMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Orders;
import com.klee.MybatisRelation.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ManyToManyTest {
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
    }
}
