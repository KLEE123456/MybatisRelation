package com.klee.MybatisRelation.pojo;

import lombok.Data;

/**
 * 产品实体类
 */
@Data
public class Product {
    private  int id;

    private String name;

    private  float price;

    private Category category;
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
