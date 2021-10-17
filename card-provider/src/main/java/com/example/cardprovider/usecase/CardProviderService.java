package com.example.cardprovider.usecase;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.Card;

import java.util.List;
import java.util.Optional;

public class CardProviderService {

    private CardAdapterProvider cardAdapterProvider;

    public CardProviderService(CardAdapterProvider cardAdapterProvider) {
        this.cardAdapterProvider = cardAdapterProvider;
    }

    public Card randomCard() {
        Optional<Card> cardAdapterProviderAll = cardAdapterProvider.findAllCards()
                .stream()
                .findAny()
                .flatMap(cards -> cards.stream().findAny());
        return cardAdapterProviderAll.orElseThrow();
    }
}
