package com.example.dataproviderentry.controller;

import com.example.cardprovider.response.CardResponse;
import com.example.cardprovider.usecase.CardProviderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
@Slf4j
@RequiredArgsConstructor()
public class CardController {

    private final CardProviderService cardProviderService;

    @GetMapping(path = "/cardGame")
    public ResponseEntity<CardResponse> cardGame() {
        return new ResponseEntity<>(cardProviderService.randomCard(), HttpStatus.OK);
    }

}
