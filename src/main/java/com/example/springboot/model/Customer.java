package com.example.springboot.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Customer(String name, String email, Date dob, Occupation occupation, CustomerGroup customerGroup) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.occupation = occupation;
        this.customerGroup = customerGroup;
    }

    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private Date dob;
    private Occupation occupation;
    private CustomerGroup customerGroup;

    public Customer() {
    }

    public Customer( int id,String name, String email,Date dob,Occupation occupation,CustomerGroup customerGroup){
        this.customerGroup= customerGroup;
        this.dob=dob;
        this.id=id;
        this.email=email;
        this.occupation=occupation;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", occupation=" + occupation +
                ", customerGroup=" + customerGroup +
                '}';
    }
}
