package com.example.cardprovider.builder.Impl;

import com.example.cardprovider.builder.ExceptionDetailsBuilder;
import com.example.cardprovider.exception.details.EmptyStackDetails;

import java.time.LocalDateTime;

public class EmptyStackDetailsBuilder implements ExceptionDetailsBuilder {

    public String title;
    public int status;
    public String details;
    public String developerMessage;
    public LocalDateTime timestamp;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    @Override
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public EmptyStackDetails getResult() {
        return new EmptyStackDetails(title, status, details,
                developerMessage, timestamp);
    }
}
