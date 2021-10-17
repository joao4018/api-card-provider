package com.example.dataproviderentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DataProviderEntryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataProviderEntryApplication.class, args);
    }

}
