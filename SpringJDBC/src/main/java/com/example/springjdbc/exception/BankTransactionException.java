package com.example.springjdbc.exception;

public class BankTransactionException extends Exception {
    public BankTransactionException(String message) {
        super(message);
    }
}
