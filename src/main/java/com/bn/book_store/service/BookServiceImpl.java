/**
 * Created by:Wondafrash
 * Date : 7/5/2024
 * Time : 10:03 AM
 */
package com.bn.book_store.service;

import com.bn.book_store.dto.BookDTO;
import com.bn.book_store.dto.BookMapper;
import com.bn.book_store.entity.Books;
import com.bn.book_store.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository repository;

    public BookDTO createBooks(BookDTO bookDTO){
        Books books = BookMapper.mapToBooks(bookDTO);
        Books savedBook = repository.save(books);
        return BookMapper.mapToBookDTO(savedBook);
    }

    @Override
    public BookDTO getBookById(int BookId) throws RuntimeException {
        Books books = repository
                .findById(BookId)
                .orElseThrow(() -> new RuntimeException("Book Details not found : " + BookId));
        return BookMapper.mapToBookDTO(books);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        List<Books> books = repository.findAll();
         //return books.stream().map(BookMapper::mapToBookDTO).collect(Collectors.toList());
        return books.stream().map((aBook)->BookMapper.mapToBookDTO(aBook)).collect(Collectors.toList());

    }


}
