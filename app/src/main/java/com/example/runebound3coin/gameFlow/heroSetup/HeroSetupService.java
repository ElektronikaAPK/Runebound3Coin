package com.example.runebound3coin.gameFlow.heroSetup;

import com.example.runebound3coin.gameData.repository.HeroDataRepository;

import javax.inject.Inject;

public class HeroSetupService {

    @Inject
    HeroDataRepository heroRepository;

    @Inject
    public HeroSetupService(HeroDataRepository heroRepository) {
        this.heroRepository = heroRepository;
    }
}
