package com.example.runebound3coin.gameData.repository;

import com.example.runebound3coin.gameData.entity.Hero;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;


public class FakeHeroDataRepository implements HeroDataRepository {

    public FakeHeroDataRepository() {
    }

    @Override
    public List<Hero> findAll() {
        return Collections.singletonList(new Hero("Zbigniew Waleczny", "Wali toporem"));
    }
}
