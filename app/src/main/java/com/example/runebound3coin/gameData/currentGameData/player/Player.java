package com.example.runebound3coin.gameData.currentGameData.player;

import com.example.runebound3coin.gameData.staticData.entity.Hero;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {

    private int id;
    private String name;
    private Hero hero;
    private boolean active;

}
