package com.example.cardprovider.usecase.impl;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.impl.Card;
import com.example.cardprovider.exception.EmptyException;
import com.example.cardprovider.response.CardResponse;
import com.example.cardprovider.usecase.CardProviderService;

import java.util.List;
import java.util.Random;

public class CardProviderServiceImpl implements CardProviderService {

    private CardAdapterProvider cardAdapterProvider;

    public CardProviderServiceImpl(CardAdapterProvider cardAdapterProvider) {
        this.cardAdapterProvider = cardAdapterProvider;
    }

    @Override
    public CardResponse randomCard() {
        Random random = new Random();
        List<Card> allCards = cardAdapterProvider.findAllCards();
        if (allCards.isEmpty()) {
            throw new EmptyException("Lista Vazia, problema no banco. Contante um administrador");
        }
        Card card = allCards.get(random.nextInt(allCards.size()));
        return new CardResponse(card);
    }
}
