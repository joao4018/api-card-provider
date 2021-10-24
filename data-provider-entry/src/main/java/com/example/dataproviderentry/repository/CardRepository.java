package com.example.dataproviderentry.repository;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.impl.Card;
import com.example.dataproviderentry.domain.CardEntity;
import com.example.dataproviderentry.mapper.CardMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"/data.sql"})
public interface CardRepository extends JpaRepository<CardEntity, Long>, CardAdapterProvider {
    default List<Card> findAllCards() {
        return CardMapper.INSTANCE.toListCard(this.findAll());
    }
}
