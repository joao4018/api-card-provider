package com.example.dataproviderentry.config;

import com.example.cardprovider.usecase.CardProviderService;
import com.example.dataproviderentry.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Autowired CardRepository cardRepository;

    @Bean
    public CardProviderService cardProviderService() {
        return new CardProviderService(cardRepository);
    }
}