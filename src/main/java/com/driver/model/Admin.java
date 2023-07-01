package com.driver.model;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import javax.annotation.Generated;
import javax.persistence.*;
@Table(name = "Admin")
@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String username;
    private String password;

    public Admin() {
    }

    public Admin(int adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

        }