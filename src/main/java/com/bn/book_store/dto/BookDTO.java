/**
 * Created by:Wondafrash
 * Date : 7/5/2024
 * Time : 11:40 AM
 */
package com.bn.book_store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private int bookId;
    private String bookName;
    private Long pages;
    private LocalDateTime publishedDate;
    private String serialNumber;
}
