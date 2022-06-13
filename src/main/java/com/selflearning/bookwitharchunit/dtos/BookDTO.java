package com.selflearning.bookwitharchunit.dtos;

import lombok.*;

@Getter
@Setter
public class BookDTO {
    private Long id;

    private String name;

    private String author;

    private double price;
}
