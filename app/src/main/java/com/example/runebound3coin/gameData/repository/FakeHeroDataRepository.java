package com.example.runebound3coin.gameData.repository;

import com.example.runebound3coin.gameData.entity.Hero;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

public class FakeHeroDataRepository  {

    @Inject
    public FakeHeroDataRepository() {
    }

    public List<Hero> findAll() {
        return Collections.singletonList(new Hero("Zbigniew Waleczny", "Wali toporem"));
    }
}
