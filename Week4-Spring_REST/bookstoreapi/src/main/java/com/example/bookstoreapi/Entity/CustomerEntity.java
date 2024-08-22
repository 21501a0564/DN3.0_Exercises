package com.example.bookstoreapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
    private Long id;
    private String name;
    private String email;
    private String pass;
}

