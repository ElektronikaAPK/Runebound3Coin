package com.example.runebound3coin.gameFlow.heroSetup.players;

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
    PlayerSetupService heroSetup;



    private PlayerRecViewAdapter playerRecViewAdapter;
    private RecyclerView playerRecView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_setup);

        playerRecViewAdapter = new PlayerRecViewAdapter(this);
        playerRecView = findViewById(R.id.playerRecView);

        playerRecView.setAdapter(playerRecViewAdapter);
        playerRecView.setLayoutManager(new LinearLayoutManager(this));

        playerRecViewAdapter.setPlayers(heroSetup.getAllPlayers());

    }
}