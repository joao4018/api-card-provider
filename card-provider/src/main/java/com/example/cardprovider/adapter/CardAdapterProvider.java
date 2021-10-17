package com.example.cardprovider.adapter;

import com.example.cardprovider.entity.Card;

import java.util.List;

public interface CardAdapterProvider {
    List<Card> findAll();
}
