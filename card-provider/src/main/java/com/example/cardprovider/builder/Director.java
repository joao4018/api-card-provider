package com.example.cardprovider.builder;

import java.time.LocalDateTime;

public class Director {
    public static void constructEmptyStackDetails(
            ExceptionDetailsBuilder builder, String details, String developerMessage) {
        builder.setDetails(details);
        builder.setStatus(204);
        builder.setTimestamp(LocalDateTime.now());
        builder.setDeveloperMessage(developerMessage);
        builder.setTitle("Não encontramos nenhuma carta, contate o administrador!");
    }

}
