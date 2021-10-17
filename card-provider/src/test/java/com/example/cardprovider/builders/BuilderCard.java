package com.example.cardprovider.builders;

import com.example.cardprovider.entity.Card;

import java.util.List;

public class BuilderCard {
    public static final List<Card> cardBuilder() {
        return List.of(new Card("321", "sas"), new Card("123", "asa"));
    }
}
