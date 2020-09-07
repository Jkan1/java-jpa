package com.sourcecode.jpa;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookRepository bookOps;

    @PostMapping("/create-book")
    public void createBook(@RequestBody Book book) {
        bookOps.save(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookOps.findAll();
    }

    @GetMapping("/book")
    public Book getBookById(@RequestParam(value = "id") int id) {
        Optional<Book> resultBook = bookOps.findById(id);
        if (resultBook.isPresent()) {
            return resultBook.get();
        } else {
            return null;
        }
    }

}
