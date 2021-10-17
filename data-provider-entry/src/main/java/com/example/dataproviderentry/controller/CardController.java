package com.example.dataproviderentry.controller;

import com.example.cardprovider.entity.Card;
import com.example.cardprovider.usecase.CardProviderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("list")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CardController {

    private final CardProviderService cardProviderService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Card> list() {
        return new ResponseEntity<>(cardProviderService.randomCard(), HttpStatus.OK);
    }

}
