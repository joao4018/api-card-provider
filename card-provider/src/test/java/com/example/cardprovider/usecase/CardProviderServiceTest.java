package com.example.cardprovider.usecase;


import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.builders.BuilderCard;
import com.example.cardprovider.entity.CardContract;
import com.example.cardprovider.entity.impl.Card;
import com.example.cardprovider.response.CardResponse;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.cardprovider.constants.exception.ExceptionConstants.ARRAY_VAZIO;

@ExtendWith(SpringExtension.class)
public class CardProviderServiceTest {

    @Mock
    CardAdapterProvider cardAdapterProvider;

    @InjectMocks
    CardProviderService cardProviderService;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    void randomCardTest() {
        List<Card> cards = BuilderCard.cardBuilder();

        List<CardResponse> cardResponses = cards
                .stream()
                .map(card -> new CardResponse(card.getCard(), card.getDescription()))
                .collect(Collectors.toList());

        Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(cards);
        Assertions.assertTrue(cardResponses.contains(cardProviderService.randomCard()));
    }

    @Test
    void randomCardTestException() {
        Assert.assertThrows(ARRAY_VAZIO, IndexOutOfBoundsException.class, () -> {
            Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(Collections.emptyList());
            cardProviderService.randomCard();
        });

    }


}