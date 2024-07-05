/**
 * Created by:AIDA
 * Date : 7/5/2024
 * Time : 10:01 AM
 */
package com.bn.book_store.entity.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private String bookName;
    private Long pages;
    private LocalDateTime publishedDate;
    private UUID serialNumber;
}
