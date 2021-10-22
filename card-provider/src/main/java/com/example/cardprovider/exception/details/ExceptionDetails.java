package com.example.cardprovider.exception.details;

import java.time.LocalDateTime;

public abstract class ExceptionDetails {
    private String title;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;

    public ExceptionDetails(String title,
                            int status,
                            String details,
                            String developerMessage,
                            LocalDateTime timestamp) {
        this.title = title;
        this.status = status;
        this.details = details;
        this.developerMessage = developerMessage;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}