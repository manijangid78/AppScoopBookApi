package com.example.AppScoop.controller;

import com.example.AppScoop.model.Book;
import com.example.AppScoop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    private BookService bookService;

    @Autowired
    public AppController(BookService bookService) {
        this.bookService = bookService;
    }

    // Get API to get details of a book resource
    @GetMapping("/getBook/{id}")
    public Book getBookById(@PathVariable("id") String id){
        return bookService.getBookById(id);
    }

    // Get API to get details of all books
    @GetMapping("/allBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    // Delete API to delete an existing book resource
    @DeleteMapping("/deleteBook/{id}")
    public boolean deleteBook(@PathVariable("id")String id){
        return bookService.deleteBook(id);
    }

    // Post API to create a new book resource
    @RequestMapping(value = "/addNewBook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean addNewEntity(@RequestBody Book book){
       return bookService.addBook(book);
    }

    // Patch API to update partial details of the existing book resource
    @RequestMapping(value = "/updateBook", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

}
