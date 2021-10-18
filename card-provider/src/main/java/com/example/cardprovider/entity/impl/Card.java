package com.example.cardprovider.entity.impl;


import com.example.cardprovider.entity.CardContract;

public class Card implements CardContract {

    private String card;
    private String description;

    public Card(String card, String description) {
        this.card = card;
        this.description = description;
    }

    public String getCard() {
        return card;
    }

    public String getDescription() {
        return description;
    }
}
