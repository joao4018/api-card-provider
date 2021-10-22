package com.example.dataproviderentry.handler;

import com.example.cardprovider.builder.Director;
import com.example.cardprovider.builder.Impl.EmptyStackDetailsBuilder;
import com.example.cardprovider.exception.EmptyException;
import com.example.cardprovider.exception.details.EmptyStackDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.DefaultResponseErrorHandler;

@RestControllerAdvice
public class RestExceptionHandler extends DefaultResponseErrorHandler {

    @ExceptionHandler(EmptyException.class)
    public ResponseEntity<?> handlerBadRequestException(EmptyException emptyStackException) {

        EmptyStackDetailsBuilder exceptionBuilder = new EmptyStackDetailsBuilder();
        Director.constructEmptyStackDetails(exceptionBuilder,
                emptyStackException.getMessage(), emptyStackException.getClass().getName());
        EmptyStackDetails emptyStackDetails = exceptionBuilder.getResult();
        return new ResponseEntity<>(
                emptyStackDetails, HttpStatus.BAD_REQUEST
        );
    }
}