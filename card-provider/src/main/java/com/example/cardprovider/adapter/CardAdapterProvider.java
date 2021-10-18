package com.example.cardprovider.adapter;

import com.example.cardprovider.entity.impl.Card;

import java.util.List;

public interface CardAdapterProvider {
    List<Card> findAllCards();
}
