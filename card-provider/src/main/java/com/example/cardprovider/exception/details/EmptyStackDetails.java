package com.example.cardprovider.exception.details;

import java.time.LocalDateTime;

public class EmptyStackDetails extends ExceptionDetails {

    public EmptyStackDetails(String title,
                             int status,
                             String details,
                             String developerMessage,
                             LocalDateTime timestamp) {
        super(title, status, details, developerMessage, timestamp);
    }
}
