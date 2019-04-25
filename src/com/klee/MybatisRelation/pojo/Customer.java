package com.klee.MybatisRelation.pojo;

import lombok.Data;

/**
 * 客户实体类
 */
@Data
public class Customer {
    private int id;

    private String name;

    private int age;

    private  String sex;

    private  IDCard idCard;



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
