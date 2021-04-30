package com.example.runebound3coin.gameFlow.heroSetup;

import com.example.runebound3coin.gameData.staticData.entity.Hero;
import com.example.runebound3coin.gameData.staticData.repository.FakeHeroDataRepository;
import com.example.runebound3coin.gameData.currentGameData.player.FakePlayerRepository;
import com.example.runebound3coin.gameData.currentGameData.player.Player;

import java.util.List;

import javax.inject.Inject;


public class HeroSetupService {

    FakePlayerRepository playerRepository;
    FakeHeroDataRepository heroRepository;

    @Inject
    public HeroSetupService(FakeHeroDataRepository heroRepository, FakePlayerRepository playerRepository) {
        this.heroRepository = heroRepository;
        this.playerRepository = playerRepository;
    }

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
