package com.corit.solutions.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "usersIdSeq", sequenceName = "users_id_seq", allocationSize=1)
public class Users implements Serializable{

    @Id
    private String username;
    @Size(min = 8)
    private String password;
    private String email;
    private String company;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private int enabled=1;
   
    
    public Users() {}

    public Users (String password) {
    
        this.password = password;
        this.enabled = 1;
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

    public int getEnabled() {
            return enabled;
    }

    public void setEnabled(int enabled) {
            this.enabled = enabled;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
