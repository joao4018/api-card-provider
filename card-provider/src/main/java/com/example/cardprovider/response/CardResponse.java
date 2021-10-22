package com.example.cardprovider.response;

public class CardResponse {

    private String card;
    private String description;

    public CardResponse(String card, String description) {
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
