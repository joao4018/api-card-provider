package com.example.cardprovider.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card1 = (Card) o;
        return Objects.equals(card, card1.card) && Objects.equals(description, card1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, description);
    }
}
