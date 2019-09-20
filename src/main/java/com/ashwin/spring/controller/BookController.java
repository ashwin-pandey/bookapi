package com.ashwin.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.spring.model.Book;
import com.ashwin.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	// Get all the books
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> list() {
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
	
}
