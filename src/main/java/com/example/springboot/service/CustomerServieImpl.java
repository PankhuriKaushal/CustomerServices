package com.example.springboot.service;


import com.example.springboot.model.Customer;
import com.example.springboot.model.CustomerDTO;
import com.example.springboot.model.CustomerGroup;
import com.example.springboot.model.Occupation;
import com.example.springboot.util.CustomerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServieImpl implements CustomerService {
//    @Autowired
//    private CustomerDetailRepository customerDetailRepository;

    @Autowired
    private CustomerUtils customerUtils;

    @Override
    public Customer addCustomer(CustomerDTO customer) {
        boolean check = customerUtils.validateCustomer(customer);
        if (check) {
            String email = customer.getEmail();
            int atIndex = email.lastIndexOf('@');
            String domainName = email.substring(atIndex + 1);
            if (domainName.equals("hikeon.tech")) {
                customer.setCustomerGroup("HIKEON");
            }
            Customer customerDetail = new Customer(customer.getName(), customer.getEmail(), customer.getDob(), Occupation.valueOf(customer.getOccupation().toUpperCase()), CustomerGroup.valueOf(customer.getCustomerGroup().toUpperCase()));
            System.out.println(customerDetail);
            Customer response = new Customer();
            try {
//                if (customerDetailRepository.countUniqueness(customerDetail.getEmail(), customer.getDob(), customerDetail.getCustomerGroup()) > 0) {
//                    throw new RuntimeException("Provide Uniqueness for email, dob and CustomerGroup");
//                }
//                response = customerDetailRepository.save(customerDetail);
            } catch (Exception e) {
                throw new RuntimeException("Duplicate Email / Check Connection");
            }
            return response;
        } else {
            throw new RuntimeException("Bad Request / Age is below 18");
        }
    }
}
