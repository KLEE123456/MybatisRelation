package com.klee.MybatisRelation.mapper;

import com.klee.MybatisRelation.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> findCustomer();
}
