package com.example.cardprovider.usecase;


import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.builders.BuilderCard;
import com.example.cardprovider.entity.Card;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
class CardProviderServiceTest {

    @Mock
    CardAdapterProvider cardAdapterProvider;

    @InjectMocks
    CardProviderService cardProviderService;

    @Test
    void randomCardTest() {
        List<Card> cards = BuilderCard.cardBuilder();
        Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(cards);
        Assert.assertTrue(cards.contains(cardProviderService.randomCard()));
    }



}