package com.example.cardprovider.usecase.impl;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.CardContract;
import com.example.cardprovider.entity.impl.Card;
import com.example.cardprovider.response.CardResponse;
import com.example.cardprovider.usecase.CardProviderService;

import java.util.List;
import java.util.Random;

import static com.example.cardprovider.constants.exception.ExceptionConstants.ARRAY_VAZIO;

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
            throw new IndexOutOfBoundsException(ARRAY_VAZIO);
        }
        Card card = allCards.get(random.nextInt(allCards.size()));
        return new CardResponse(card);
    }
}
