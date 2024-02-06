package com.example.springboot.model;


import java.sql.Date;



public class CustomerDTO {

    private int id;


    private String name;


    private String email;


    private Date dob;

    private String occupation;


    private String customerGroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getOccupation() {
        return occupation.toUpperCase();
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup.toUpperCase();
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", occupation='" + occupation + '\'' +
                ", customerGroup='" + customerGroup + '\'' +
                '}';
    }
}
