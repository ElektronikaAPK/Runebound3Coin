package com.example.runebound3coin.gameFlow.heroSetup.players;

import android.content.Intent;
import android.os.Bundle;

import com.example.runebound3coin.gameFlow.heroSetup.PlayerSetupService;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.runebound3coin.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerSetupActivity extends AppCompatActivity {

    @Inject
    PlayerSetupService playerSetup;



    private PlayerRecViewAdapter playerRecViewAdapter;
    private RecyclerView playerRecView;
    private Intent intent;


    @Override
    protected void onResume() {
        super.onResume();

        addHeroSelection();
        playerRecViewAdapter.setPlayers(playerSetup.getAllPlayers());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_setup);


        playerRecViewAdapter = new PlayerRecViewAdapter(this);
        playerRecView = findViewById(R.id.playerRecView);

        playerRecView.setAdapter(playerRecViewAdapter);
        playerRecView.setLayoutManager(new LinearLayoutManager(this));



    }

    private void addHeroSelection() {
        intent = getIntent();
        if (!intent.hasExtra("isPlayerPicked")) return;

        int heroId = intent.getIntExtra("heroId", -1);
        int playerId = intent.getIntExtra("playerId", -1);
        playerSetup.setHeroForPlayer(heroId, playerId);
    }
}