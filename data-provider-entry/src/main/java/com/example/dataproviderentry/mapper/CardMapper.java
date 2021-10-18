package com.example.dataproviderentry.mapper;

import com.example.cardprovider.entity.CardContract;
import com.example.dataproviderentry.domain.CardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CardMapper {
    public static final CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

    public abstract List<CardContract> toListCard(List<CardEntity> cardEntities);

}