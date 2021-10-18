package com.example.dataproviderentry.repository;

import com.example.cardprovider.adapter.CardAdapterProvider;
import com.example.cardprovider.entity.CardContract;
import com.example.dataproviderentry.domain.CardEntity;
import com.example.dataproviderentry.mapper.CardMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Long>, CardAdapterProvider {
    default List<CardContract> findAllCards() {
        return CardMapper.INSTANCE.toListCard(this.findAll());
    }
}
