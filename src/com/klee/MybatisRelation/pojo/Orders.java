package com.klee.MybatisRelation.pojo;

import lombok.Data;

import java.util.List;

/**
 * 订单实体类
 */
@Data
public class Orders {
    private int id;

    private String number;


    private List<Product> productList;



    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
