package com.example.cardprovider.response;

import java.util.Objects;

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

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardResponse that = (CardResponse) o;
        return card.equals(that.card) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, description);
    }
}
