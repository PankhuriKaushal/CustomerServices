package com.example.springboot.repository;/*
package com.unsilo.api.related.repository;

import com.unsilo.api.related.model.Customer;
import com.unsilo.api.related.model.CustomerGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface CustomerDetailRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT COUNT(c) FROM Customer c WHERE c.occupation = :occupation AND c.dob = :dob AND c.customerGroup = :customerGroup")
    long countUniqueness(@Param("email") String email, @Param("dob") Date dob, @Param("dob") CustomerGroup customerGroup);

}

*/
