package com.klee.MybatisRelation.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String  cname;

    private List<Orders> ordersList;

    private List<Ordersitem> ordersitemList;

    private List<Product> productList;

}
