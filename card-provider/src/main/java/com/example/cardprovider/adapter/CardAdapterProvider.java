package com.example.cardprovider.adapter;

import com.example.cardprovider.entity.Card;

import java.util.List;
import java.util.Optional;

public interface CardAdapterProvider {
    List<Card> findAllCards();
}
