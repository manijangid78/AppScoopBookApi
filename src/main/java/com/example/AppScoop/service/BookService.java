package com.example.AppScoop.service;

import com.example.AppScoop.model.Book;
import com.example.AppScoop.reposiroty.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {



    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String save(List<Book> books){
        try{
            bookRepository.saveAll(books);
            return "done";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public Book getBookById(String bookId){
        try {
            return bookRepository.getOne(bookId);
        }catch (Exception e){
            return null;
        }
    }

    public List<Book> getAllBooks(){
        try{
            return bookRepository.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public boolean deleteBook(String id){
        try{
            bookRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean addBook(Book book){
        try{
            bookRepository.save(book);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean updateBook(Book book){
        try{
            bookRepository.save(book);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
