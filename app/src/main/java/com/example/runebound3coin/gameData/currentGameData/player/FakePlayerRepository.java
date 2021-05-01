package com.example.runebound3coin.gameData.currentGameData.player;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FakePlayerRepository implements PlayerRepository {

    Player player1 = new Player(1, null, null, false);
    Player player2 = new Player(2,null, null, false);
    Player player3 = new Player(3,null, null, false);
    Player player4 = new Player(4,null, null, false);

    Map<Integer, Player> players = new HashMap<>();
    @Inject
    public FakePlayerRepository() {
    }

    public void initialize() {
        for (Player player : Arrays.asList(player1, player2,player3,player4)) {
            players.put(player.getId(), player);
        }
    }

    public List<Player> findAll() {
        return  new ArrayList<>(players.values());
    }

    public Player findById(int playerId) {
        return players.get(playerId);
    }

    public void save(Player player) {
        players.put(player.getId(), player);
    }
}
