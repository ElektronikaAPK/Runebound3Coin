package com.example.runebound3coin.gameData.staticData.repository;

import com.example.runebound3coin.gameData.currentGameData.player.Player;
import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class FakeHeroDataRepository implements HeroRepository{

    Hero hero1 = new Hero(1, "Zbigniew Waleczny", "Wali toporem");
    Hero hero2 = new Hero(2, "Tytanowy Janusz", "Wali toporem");
    Hero hero3 = new Hero(3, "Mroczny Zbigniew", "Wali toporem");
    Hero hero4 = new Hero(4, "Ognista Marianna", "Wali toporem");
    Hero hero5 = new Hero(5, "Chytry Jerzy", "Wali toporem");
    Hero hero6 = new Hero(6, "Diamentowy Patryk", "Wali toporem");
    Hero hero7 = new Hero(7, "Płocha Joanna", "Wali toporem");
    Hero hero8 = new Hero(8, "Epicki Mateusz", "Wali toporem");
    Hero hero9 = new Hero(9, "Gniewny Tadzio", "Wali toporem");

    List<Hero> heroes;

    @Inject
    public FakeHeroDataRepository() {
        heroes = Arrays.asList(hero1, hero2, hero3, hero4, hero5, hero6, hero7, hero8, hero9);
    }

    public List<Hero> findAll() {
        return heroes;
    }

    public Hero findById(int heroId) {
        for (Hero hero : heroes) {
            if (hero.getId() == heroId) {
                return hero;
            }
        }
        return null;
    }
}
