package com.example.cardprovider.entity;

public class Card {

    private String card;
    private String description;

    public Card(String card, String description) {
        this.card = card;
        this.description = description;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
