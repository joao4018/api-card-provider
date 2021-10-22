package com.example.cardprovider.builder;

import java.time.LocalDateTime;

public interface ExceptionDetailsBuilder {
    void setTitle(String title);
    void setStatus(int status);
    void setDetails(String details);
    void setDeveloperMessage(String developerMessage);
    void setTimestamp(LocalDateTime timestamp);
}