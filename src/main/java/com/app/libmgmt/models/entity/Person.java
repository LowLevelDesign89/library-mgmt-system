package com.app.libmgmt.models.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private String name;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;
}
