package com.example.runebound3coin.gameFlow.player;

import com.example.runebound3coin.gameData.entity.Hero;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {

    private String name;
    private Hero hero;
    private boolean active;
}
