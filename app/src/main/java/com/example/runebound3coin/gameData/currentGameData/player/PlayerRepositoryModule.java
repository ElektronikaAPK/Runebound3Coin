package com.example.runebound3coin.gameData.currentGameData.player;

import com.example.runebound3coin.gameData.staticData.repository.FakeHeroDataRepository;
import com.example.runebound3coin.gameData.staticData.repository.HeroRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class PlayerRepositoryModule {


        @Binds
        @Singleton
        public abstract PlayerRepository bindPlayerRepository(FakePlayerRepository fakePlayerRepository);


}
