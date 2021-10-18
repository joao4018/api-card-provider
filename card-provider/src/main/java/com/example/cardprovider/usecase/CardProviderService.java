package com.example.cardprovider.usecase;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.CardContract;
import com.example.cardprovider.entity.impl.Card;
import com.example.cardprovider.response.CardResponse;

import java.util.List;
import java.util.Random;

import static com.example.cardprovider.constants.exception.ExceptionConstants.ARRAY_VAZIO;

public class CardProviderService {

    private CardAdapterProvider cardAdapterProvider;

    public CardProviderService(CardAdapterProvider cardAdapterProvider) {
        this.cardAdapterProvider = cardAdapterProvider;
    }

    public CardResponse randomCard() {
        Random random = new Random();
        List<CardContract> allCards = cardAdapterProvider.findAllCards();
        if (allCards.isEmpty()) {
            throw new IndexOutOfBoundsException(ARRAY_VAZIO);
        }
        CardContract cardContract = allCards.get(random.nextInt(allCards.size()));
        return new CardResponse(cardContract.getCard(), cardContract.getDescription());
    }
}
