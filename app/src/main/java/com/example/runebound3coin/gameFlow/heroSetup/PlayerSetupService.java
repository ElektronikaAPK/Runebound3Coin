package com.example.runebound3coin.gameFlow.heroSetup;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.runebound3coin.gameData.currentGameData.player.PlayerRepository;
import com.example.runebound3coin.gameData.staticData.entity.Hero;
import com.example.runebound3coin.gameData.staticData.repository.FakeHeroDataRepository;
import com.example.runebound3coin.gameData.currentGameData.player.FakePlayerRepository;
import com.example.runebound3coin.gameData.currentGameData.player.Player;
import com.example.runebound3coin.gameData.staticData.repository.HeroRepository;

import java.util.List;

import javax.inject.Inject;


public class PlayerSetupService {

    private final PlayerRepository playerRepository;
    private final HeroRepository heroRepository;

    @Inject
    public PlayerSetupService(HeroRepository heroRepository, PlayerRepository playerRepository) {
        this.heroRepository = heroRepository;
        this.playerRepository = playerRepository;
    }

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public List<Hero> getAllAvailableHeroes() {
        //TODO: filter by expansions
        //TODO: filter out heroes already picked
        return heroRepository.findAll();
    }

    public void setHeroForPlayer(int heroId, int playerId) {

        Player player = playerRepository.findById(playerId);
        Hero hero = heroRepository.findById(heroId);

        player.setHero(hero);
        player.setActive(true);

        playerRepository.save(player);
    }

    public void initialize() {
        playerRepository.initialize();
    }
}
