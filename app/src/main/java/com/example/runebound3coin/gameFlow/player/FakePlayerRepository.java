package com.example.runebound3coin.gameFlow.player;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

public class FakePlayerRepository  {

    @Inject
    public FakePlayerRepository() {
    }

    public List<Player> findAll() {
        return Collections.singletonList(new Player());
    }
}
