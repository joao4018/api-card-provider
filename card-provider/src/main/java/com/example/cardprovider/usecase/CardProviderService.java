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
        Random rand = new Random();
        List<Card> cardAdapterProviderAll = cardAdapterProvider.findAll();
        return cardAdapterProviderAll.get(rand.nextInt(cardAdapterProviderAll.size()));
    }
}
