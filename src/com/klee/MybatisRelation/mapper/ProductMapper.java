package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Product;

import java.util.List;

public interface ProductMapper {
    //产品查询
    List<Product> listProduct();
    //产品与订单关系的查询
    List<Product> findProduct();

    //产品添加的方法
    int insertProducts(Product product);


}
