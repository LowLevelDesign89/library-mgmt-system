package com.app.libmgmt.models.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Book {
    private String bookId;
    private String isbn;
    private String title;
    private String subject;
    private String language;
    private List<Author> authors;
    private Integer numberOfPages;
}
