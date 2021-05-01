package com.example.runebound3coin.gameData.staticData.repository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class HeroRepositoryModule {

    @Binds
    @Singleton
    public abstract HeroRepository bindHeroRepository(FakeHeroDataRepository fakeHeroDataRepository);
}
