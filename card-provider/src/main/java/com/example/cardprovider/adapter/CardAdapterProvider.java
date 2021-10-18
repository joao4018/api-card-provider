package com.example.cardprovider.adapter;

import com.example.cardprovider.entity.CardContract;

import java.util.List;

public interface CardAdapterProvider {
    List<CardContract> findAllCards();
}
