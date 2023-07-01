package com.driver.repository;

import com.driver.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    List<Customer> findAll();

    void save(Customer customer);

    void deleteById(Integer customerId);

    ThreadLocal<Object> findById(int customerId);
}
