package com.example.cardprovider.response;

import com.example.cardprovider.entity.impl.Card;

public class CardResponse {

    private Card card;

    public CardResponse(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }


}
