package com.app.libmgmt.models.entity;

import com.app.libmgmt.models.enums.BookFormat;
import com.app.libmgmt.models.enums.BookStatus;
import lombok.Data;

import java.util.Date;

@Data
public class BookLineItem {
    private String bookId;
    private String lineItemId;
    private Date dateOfPurchase;
    private Date publishedDate;
    private BookFormat bookFormat;
    private boolean isReferenceCopy;
    private BookStatus bookStatus;
    private Rack placedAt;
}
