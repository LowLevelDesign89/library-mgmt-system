package com.app.libmgmt.models.entity;

import lombok.Data;

import java.util.Date;

@Data
public class LibraryCard {
    private String userId;
    private String cardId;
    private boolean isActive;
    private Date issuedOn;
}
