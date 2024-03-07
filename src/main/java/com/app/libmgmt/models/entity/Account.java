package com.app.libmgmt.models.entity;

import com.app.libmgmt.models.enums.AccountStatus;
import lombok.Data;

@Data
public class Account {
    private String userId;
    private String password;
    private AccountStatus status;
    private Person person;

}
