/**
 * Created by:AIDA
 * Date : 7/5/2024
 * Time : 10:00 AM
 */
package com.bn.book_store.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    private String bookName;
    private Long pages;
}
