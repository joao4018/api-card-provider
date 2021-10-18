package com.example.cardprovider.builders;


import com.example.cardprovider.entity.CardContract;
import com.example.cardprovider.entity.impl.Card;

import java.util.List;

public class BuilderCard {
    public static final List<CardContract> cardBuilder() {
        return List.of(new Card("321", "sas"), new Card("123", "asa"));
    }
}
