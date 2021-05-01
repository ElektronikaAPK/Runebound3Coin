package com.example.runebound3coin.gameData.currentGameData.player;


import java.util.ArrayList;
import java.util.List;

public interface PlayerRepository {


     List<Player> findAll();

     Player findById(int playerId) ;

     void save(Player player);

     void initialize();

}
