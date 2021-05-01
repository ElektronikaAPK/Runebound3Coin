package com.example.runebound3coin.gameData.staticData.repository;

import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.List;


public interface HeroRepository {

    List<Hero> findAll();
    Hero findById(int heroId);
}
