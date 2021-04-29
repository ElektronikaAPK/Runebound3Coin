package com.example.runebound3coin.gameFlow.player;

import com.example.runebound3coin.gameData.entity.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

public class FakePlayerRepository  {

    Player player = new Player("Zbyszek", new Hero("Zbigniew Waleczny", "Wali toporem"), true);
    Player player2 = new Player(null, null, false);
    Player player3 = new Player(null, null, false);
    Player player4 = new Player(null, null, false);

    @Inject
    public FakePlayerRepository() {
    }

    public List<Player> findAll() {
        return Arrays.asList(player, player2, player3, player4);
    }
}
