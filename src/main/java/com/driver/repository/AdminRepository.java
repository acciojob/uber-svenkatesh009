package com.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driver.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

    void save(Admin admin);

    ThreadLocal<Object> findById(Integer adminId);

    void deleteById(int adminId);
}
