package com.example.pawpalandiaDB.exceptions;

public class ProductNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(Long id) {
        super("Could not find product " + id);
    }
}
