package com.bn.book_store.service;

import com.bn.book_store.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO createBooks(BookDTO bookDTO);
    BookDTO getBookById(int id) throws RuntimeException;

    List<BookDTO> getAllBooks();
}
