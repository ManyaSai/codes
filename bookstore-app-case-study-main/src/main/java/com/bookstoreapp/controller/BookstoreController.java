package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookstoreController {

    @Autowired
    private BookstoreService bookstoreService;

    // GET : /books
    // Return Response code of 200
    @GetMapping
    public List<Book> getAllBooks() {
        return bookstoreService.getAllBooks();
    }


    // POST : /books
    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookstoreService.saveBook(book);
    }

    // create a PUT request to update a book
    // Return Response code of 202

   // PUT: /books/{id}
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookstoreService.updateBook(id, book);
    }

    // create a DELETE request to delete a book
    // Return Response code of 204

    // DELETE : /books/{id}
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookstoreService.deleteBook(id);
    }


    // create a GET request to get a book by id
    // Return Response code of 200

    // GET: /books/{id}
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookstoreService.getBookById(id);
    }




}
