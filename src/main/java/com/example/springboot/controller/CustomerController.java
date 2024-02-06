package com.example.springboot.controller;


import com.example.springboot.model.Customer;
import com.example.springboot.model.CustomerDTO;
import com.example.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController

@Validated
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(path = "/abc", method = POST)
    public Customer relatedIdInPath(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        return customerService.addCustomer(customerDTO);
//        return null;
    }
}
