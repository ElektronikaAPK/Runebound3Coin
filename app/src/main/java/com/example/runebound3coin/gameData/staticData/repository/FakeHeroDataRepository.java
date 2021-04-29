package com.example.runebound3coin.gameData.staticData.repository;

import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class FakeHeroDataRepository  {

    @Inject
    public FakeHeroDataRepository() {
    }

    public List<Hero> findAll() {
        return Collections.singletonList(new Hero("Zbigniew Waleczny", "Wali toporem"));
    }
}
