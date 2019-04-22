package com.klee.MybatisRelation.pojo;

import lombok.Data;

@Data
public class Ordersitem {
    private int id;

    private int oid;

    private int pid;

    private  int num;

    @Override
    public String toString() {
        return "Ordersitem{" +
                "num=" + num +
                '}';
    }
}
