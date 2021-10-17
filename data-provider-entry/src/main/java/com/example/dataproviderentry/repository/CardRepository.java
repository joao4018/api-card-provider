package com.example.dataproviderentry.repository;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.Card;
import com.example.dataproviderentry.domain.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Long>, CardAdapterProvider {
    default List<Card> findAllCards() {
        List<Card> cards = new ArrayList<>();
        List<CardEntity> all = this.findAll();

        for (CardEntity cardEntity : all) {
            Card card = new Card(cardEntity.getCard(), cardEntity.getDescription());
            cards.add(card);
        }

        return cards;
    }
}
