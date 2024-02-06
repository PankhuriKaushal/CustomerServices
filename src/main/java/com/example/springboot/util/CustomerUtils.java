package com.example.springboot.util;


import com.example.springboot.model.CustomerDTO;
import com.example.springboot.model.CustomerGroup;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class CustomerUtils {
    public boolean validateCustomer(CustomerDTO customer) {
        boolean validateAgeCheck = validateAge(customer.getDob().toLocalDate());
        boolean validateOccupationCheck = validateOccupation(customer.getOccupation());
        boolean validateCustomerGroupCheck = validateCustomerGroup(customer.getCustomerGroup());
        boolean validateEmailCheck = validateEmailGroup(customer.getEmail());
        if (validateOccupationCheck && validateCustomerGroupCheck && validateEmailCheck) {
            return true;
        }
        return false;
    }

    private boolean validateEmailGroup(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean validateCustomerGroup(String customerGroup) {
        if (customerGroup != null) {
            if (CustomerGroup.valueOf(customerGroup.toUpperCase()) != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean validateOccupation(String occupation) {
        if (occupation != null) {
            if (CustomerGroup.valueOf(occupation) != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean validateAge(LocalDate dob) {
        if (dob != null) {
            int age = Period.between(dob, LocalDate.now()).getYears();
            if (age >= 18) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
