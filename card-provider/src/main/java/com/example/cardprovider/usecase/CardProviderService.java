package com.example.cardprovider.usecase;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.Card;

import java.util.List;
import java.util.Random;

import static com.example.cardprovider.constants.exception.ExceptionConstants.ARRAY_VAZIO;

public class CardProviderService {

    private CardAdapterProvider cardAdapterProvider;

    public CardProviderService(CardAdapterProvider cardAdapterProvider) {
        this.cardAdapterProvider = cardAdapterProvider;
    }

    public Card randomCard() {
        Random random = new Random();
        List<Card> allCards = cardAdapterProvider.findAllCards();
        if (allCards.isEmpty()){
            throw new IndexOutOfBoundsException(ARRAY_VAZIO);
        }
        return allCards.get(random.nextInt(allCards.size()));

    }
}
