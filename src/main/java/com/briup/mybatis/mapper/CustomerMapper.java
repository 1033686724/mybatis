package com.briup.mybatis.mapper;

import com.briup.mybatis.bean.Customer;

import java.util.List;

public interface CustomerMapper {
    void insert(Customer customer);
    void deleteById(int id);
    void deleteAll();
    void update(Customer customer);
    List<Customer>selectAll();
    Customer selectById(int id);
    int count();
}
