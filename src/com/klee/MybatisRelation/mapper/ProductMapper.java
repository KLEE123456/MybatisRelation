package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Product;

import java.util.List;

public interface ProductMapper {
    //产品查询
    List<Product> listProduct();
}
