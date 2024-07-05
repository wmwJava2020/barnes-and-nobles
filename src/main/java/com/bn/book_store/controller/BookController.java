/**
 * Created by:Wondafrash
 * Date : 7/5/2024
 * Time : 10:07 AM
 */
package com.bn.book_store.controller;

import com.bn.book_store.dto.BookDTO;
import com.bn.book_store.dto.BookMapper;
import com.bn.book_store.entity.Books;
import com.bn.book_store.entity.reponse.BookResponse;
import com.bn.book_store.entity.request.BookRequest;
import com.bn.book_store.service.BookService;
import com.bn.book_store.service.BookServiceImpl;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book") //base url or endpoint//https://localhost:8000/book/sales
public class BookController {
    @Autowired
    BookServiceImpl service;

    @PostMapping(value = "/sales", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDTO> createBooks(@RequestBody BookDTO dto) {

        BookDTO saveBooks = service.createBooks(dto);

        return new ResponseEntity<>(saveBooks, HttpStatus.ACCEPTED);
    }

    @GetMapping("{id}") // URI template name is [id]
    public ResponseEntity<BookDTO> getBookById(@PathVariable("id") int bookId){ //method argument name is [bookId]

        BookDTO bookDto = service.getBookById(bookId);

        return ResponseEntity.ok(bookDto);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BookDTO>> getAllBooks(){

        List<BookDTO> dtoList = service.getAllBooks();

        return ResponseEntity.ok(dtoList);

    }
}


