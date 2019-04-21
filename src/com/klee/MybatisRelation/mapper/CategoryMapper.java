package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    //产品类别查询
    List<Category> listCategory();
}
