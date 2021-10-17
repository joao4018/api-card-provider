package com.example.dataproviderentry.repository;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.Card;
import com.example.dataproviderentry.domain.CardEntity;
import com.example.dataproviderentry.mapper.CardMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CardRepository extends JpaRepository<CardEntity, Long>, CardAdapterProvider {
    default Optional<List<Card>> findAllCards() {
        return Optional.ofNullable(CardMapper.INSTANCE.toListCard(this.findAll()));
    }
}
