package com.balsani.domain.services;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
