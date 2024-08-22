package com.example.bookstoreapi.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookstoreapi.DTO.BookDTO;
import com.example.bookstoreapi.Entity.Book;
import com.example.bookstoreapi.Mapper.EntityMap;

@RestController
@RequestMapping("/books")
public class BookController {
	 @Autowired
     public EntityMap EntityMap;
    private List<Book> bl = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks() {
        return bl;
    }

    @PostMapping("/dto")
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO addBookWithDTO(@RequestBody BookDTO bookDTO) {
        Book book = EntityMap.DTObookmap(bookDTO);
        bl.add(book);
        return EntityMap.bookDTOmap(book);
    }

    @PostMapping("/entity")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBookWithEntity(@RequestBody Book book) {
        bl.add(book);
        return book;
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String author) {
        return bl.stream()
                       .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
                                       (author == null || book.getAuthor().equalsIgnoreCase(author)))
                       .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bl.stream()
                       .filter(book -> book.getId().equals(id))
                       .findFirst()
                       .map(book -> {
                           // Create custom headers
                           HttpHeaders headers = new HttpHeaders();
                           headers.add("X-Bookstore-API-Version", "1.0");
                           return new ResponseEntity<>(book, headers, HttpStatus.OK);
                       })
                       .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND)); 
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        for (Book book : bl) {
            if (book.getId().equals(id)) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setPrice(updatedBook.getPrice());
                book.setIsbn(updatedBook.getIsbn());
                HttpHeaders headers = new HttpHeaders();
                headers.add("X-Bookstore-API-Version", "1.0");
                return new ResponseEntity<>(book, headers, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable Long id) {
        bl.removeIf(book -> book.getId().equals(id));
    }
}
