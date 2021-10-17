package com.example.cardprovider.usecase;


import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.builders.BuilderCard;
import com.example.cardprovider.entity.Card;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

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
        Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(cards);
        Assert.assertTrue(cards.contains(cardProviderService.randomCard()));
    }

    @Test
    void randomCardTestException()  {
        Assert.assertThrows(ARRAY_VAZIO, IndexOutOfBoundsException.class, () -> {
            Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(Collections.emptyList());
            cardProviderService.randomCard();
        });

    }


}