package com.example.cardprovider.usecase;


import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.builders.BuilderCard;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class CardProviderServiceTest {

    @Mock
    CardAdapterProvider cardAdapterProvider;

    @InjectMocks
    CardProviderService cardProviderService;

    @Test
    void randomCardTest() {
        Mockito.when(cardAdapterProvider.findAllCards()).thenReturn(BuilderCard.cardBuilder());
        Assert.assertEquals(cardProviderService.randomCard(), BuilderCard.cardBuilder().get().get(0));
    }



}