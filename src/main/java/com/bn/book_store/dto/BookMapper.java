/**
 * Created by:Wondafrash
 * Date : 7/5/2024
 * Time : 11:42 AM
 */
package com.bn.book_store.dto;

import com.bn.book_store.entity.Books;

public class BookMapper {

    public static BookDTO mapToBookDTO(Books books) { // accept the book and copied to bookDTO transferring to DTO
        return new BookDTO(
                books.getBookId(),
                books.getBookName(),
                books.getPages(),
                books.getPublishedDate(),
                books.getSerialNumber());
    }

    public static Books mapToBooks(BookDTO bookDTO) { // transferring form DTO to Books
        return new Books(
                bookDTO.getBookId(),
                bookDTO.getBookName(),
                bookDTO.getPages(),
                bookDTO.getPublishedDate(),
                bookDTO.getSerialNumber());
    }
}
