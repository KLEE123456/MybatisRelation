package com.klee.MybatisOneToMany.mapper;

import com.klee.MybatisOneToMany.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    //产品类别查询
    List<Category> listCategory();
}
