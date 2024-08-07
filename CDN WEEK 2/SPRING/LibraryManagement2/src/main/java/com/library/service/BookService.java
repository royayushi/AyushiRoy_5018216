package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for bookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Sample method to demonstrate functionality
    public void displayBooks() {
        bookRepository.getBooks().forEach(System.out::println);
    }
}


