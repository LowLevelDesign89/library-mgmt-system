package com.app.libmgmt.models.entity;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
