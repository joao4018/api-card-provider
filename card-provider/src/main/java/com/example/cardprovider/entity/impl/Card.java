package com.example.cardprovider.entity.impl;


import com.example.cardprovider.entity.CardContract;

import java.util.Objects;

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

    public String getDescription() {
        return description;
    }

}
