package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    //订单查询
    List<Orders>  findOrders();
}
