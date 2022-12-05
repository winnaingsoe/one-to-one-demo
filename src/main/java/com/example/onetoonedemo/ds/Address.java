package com.example.onetoonedemo.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String StreetName;
    private String zipCode;
    private String city;

    public Address() {

    }

    public Address(String streetName, String zipCode, String city) {
        StreetName = streetName;
        this.zipCode = zipCode;
        this.city = city;
    }
}
