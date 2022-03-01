package com.example.vet_service.vet_service.exceptions;


import lombok.Getter;

@Getter
public class  AwesomeServiceException extends RuntimeException {

    private final TypicalError typicalError;

    public AwesomeServiceException(String message, TypicalError typicalError) {
        super(message);
        this.typicalError = typicalError;
    }

}