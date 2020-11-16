package com.example.AppScoop;

import com.example.AppScoop.model.Book;
import com.example.AppScoop.service.BookService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class AppScoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppScoopApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BookService bookService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/book.json");
			try {
				List<Book> books = mapper.readValue(inputStream,typeReference);
				bookService.save(books);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
