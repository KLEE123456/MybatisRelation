package com.klee.MybatisRelation.pojo;

import lombok.Data;

@Data
public class IDCard {
    private  int id;

    private  String code;

    private  Customer customer;

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
