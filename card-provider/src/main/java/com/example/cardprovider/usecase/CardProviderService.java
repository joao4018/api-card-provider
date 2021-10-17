package com.example.cardprovider.usecase;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.Card;

import java.util.List;
import java.util.Random;

public class CardProviderService {

    private CardAdapterProvider cardAdapterProvider;

    public CardProviderService(CardAdapterProvider cardAdapterProvider) {
        this.cardAdapterProvider = cardAdapterProvider;
    }

    public Card randomCard() {
        Random random = new Random();
        List<Card> allCards = cardAdapterProvider.findAllCards();
        return allCards.get(random.nextInt(allCards.size()));
    }
}
