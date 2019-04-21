package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    List<Orders>  findOrders();
}
