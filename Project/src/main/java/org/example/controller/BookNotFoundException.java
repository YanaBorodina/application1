package org.example.controller;

public class BookNotFoundException extends  RuntimeException{
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
