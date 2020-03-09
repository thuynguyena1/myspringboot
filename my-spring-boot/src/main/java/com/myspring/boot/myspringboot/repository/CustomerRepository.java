package com.myspring.boot.myspringboot.repository;

import com.myspring.boot.myspringboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
