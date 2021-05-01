package com.example.runebound3coin.gameFlow.heroSetup.heroSelection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameFlow.heroSetup.PlayerSetupService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HeroSelectionActivity extends AppCompatActivity {

    @Inject
    PlayerSetupService playerSetupService;

    private HeroSelectionRecViewAdapter heroSelectionAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_selection);

        heroSelectionAdapter = new HeroSelectionRecViewAdapter(this);
        recyclerView = findViewById(R.id.hero_selection_recycler_view);

        recyclerView.setAdapter(heroSelectionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        heroSelectionAdapter.setAvailableHeroes(playerSetupService.getAllAvailableHeroes());
        Intent intent = getIntent();
        int playerBeingSet = intent.getIntExtra("playerPosition", 1);
        heroSelectionAdapter.setPlayerBeingSet(playerBeingSet);
    }


}