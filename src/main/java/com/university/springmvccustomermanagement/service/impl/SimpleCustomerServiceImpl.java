package com.university.springmvccustomermanagement.service.impl;

import com.university.springmvccustomermanagement.model.Customer;
import com.university.springmvccustomermanagement.service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customer;
    static {
        customer = new HashMap<>();
        customer.put(1, new Customer(1, "Yasuo", "yassuo@gmail.com", "Ilonia"));
        customer.put(2, new Customer(2, "Zed", "zed@gmail.com", "Ionia"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customer.values());
    }
    @Override
    public Customer findById(int id) {
        return customer.get(id);
    }

}
