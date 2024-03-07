package com.app.libmgmt.models.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BookLending {
    private String userId;
    private String bookId;
    private Date issuedDate;
    private Date returnDate;
    private String lineItemId;
}
