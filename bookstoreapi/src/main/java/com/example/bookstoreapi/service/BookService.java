package com.example.bookstoreapi.service;

import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    // Get all books
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    // Add new book
    public Book addBook(Book book) {
        return repository.save(book);
    }

    // Update book
    public Book updateBook(Long id, Book updatedBook) {

        Book book = repository.findById(id).orElse(null);

        if (book != null) {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());

            return repository.save(book);
        }

        return null;
    }

    // Delete book
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}