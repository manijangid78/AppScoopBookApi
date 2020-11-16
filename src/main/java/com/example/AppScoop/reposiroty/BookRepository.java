package com.example.AppScoop.reposiroty;

import com.example.AppScoop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
