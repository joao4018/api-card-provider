package com.example.cardprovider.factory.impl;

import com.example.cardprovider.entity.CardContract;
import com.example.cardprovider.entity.impl.Card;
import com.example.cardprovider.factory.CardFactory;

public class CardFactoryImpl implements CardFactory {
    @Override
    public CardContract create(String card, String description) {
        return new Card(card,description);
    }
}
