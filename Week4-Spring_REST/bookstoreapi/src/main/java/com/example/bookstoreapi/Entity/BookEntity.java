package com.example.bookstoreapi.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookEntity {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String isbn;
}
