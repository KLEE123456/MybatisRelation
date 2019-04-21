package com.klee.MybatisRelation.pojo;

import lombok.Data;

import java.util.List;

/**
 * 产品类别实体类
 */
@Data
public class Category {
    private int id;

    private String name;

    private List<Product>  productList;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
