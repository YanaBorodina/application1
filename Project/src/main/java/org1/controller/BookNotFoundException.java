package org1.controller;

public class BookNotFoundException extends  RuntimeException{
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
