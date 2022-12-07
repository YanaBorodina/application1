package org.example.controller;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookNotFoundException extends  RuntimeException{
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
