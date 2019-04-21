package com.klee.MybatisOneToMany.mapper;

import com.klee.MybatisOneToMany.pojo.Product;

import java.util.List;

public interface ProductMapper {
    //产品查询
    List<Product> listProduct();
}
