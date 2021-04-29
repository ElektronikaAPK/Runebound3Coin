package com.example.runebound3coin.gameData.repository;

import com.example.runebound3coin.gameData.entity.Hero;

import java.util.List;

public interface HeroDataRepository {
    List<Hero> findAll();
}
