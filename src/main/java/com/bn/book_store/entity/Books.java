/**
 * Created by:Wondafrash
 * Date : 7/5/2024
 * Time : 9:56 AM
 */
package com.bn.book_store.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "books_tbl")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int bookId;
    private String bookName;
    private Long pages;
    private LocalDateTime publishedDate;
    private String serialNumber;

    public Books() {
    }

    public Books(int bookId, String bookName, Long pages, LocalDateTime publishedDate, String serialNumber) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
        this.publishedDate = publishedDate;
        this.serialNumber = serialNumber;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public LocalDateTime getPublishedDate() {
        LocalDateTime dateTime  = LocalDateTime.now();
        return dateTime.now();
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate.now();
    }

    public String getSerialNumber() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", pages=" + pages +
                ", publishedDate=" + publishedDate +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
