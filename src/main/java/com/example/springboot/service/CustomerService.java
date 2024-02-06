package com.example.springboot.service;


import com.example.springboot.model.Customer;
import com.example.springboot.model.CustomerDTO;

public interface CustomerService {
    Customer addCustomer(CustomerDTO customer);
}
