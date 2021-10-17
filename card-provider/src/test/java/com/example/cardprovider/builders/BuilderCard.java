package com.example.cardprovider.builders;

import com.example.cardprovider.entity.Card;

import java.util.List;
import java.util.Optional;

public class BuilderCard {
    public static final Optional<List<Card>> cardBuilder() {
        return Optional.of(List.of(new Card("321","sas")));
    }
}
