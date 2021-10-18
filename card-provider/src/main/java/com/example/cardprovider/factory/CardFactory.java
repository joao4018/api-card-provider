package com.example.cardprovider.factory;

import com.example.cardprovider.entity.CardContract;

public interface CardFactory {
    CardContract create(String card, String description);
}
