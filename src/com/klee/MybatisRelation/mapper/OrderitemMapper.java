package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Ordersitem;

public interface OrderitemMapper {
    int insertOrderitem(Ordersitem ordersitem);
    int deleteOrderitem(int id);
}
