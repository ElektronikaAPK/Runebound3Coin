package com.example.runebound3coin.gameFlow.heroSetup;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import com.example.runebound3coin.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HeroSetupActivity extends AppCompatActivity {

    @Inject
     HeroSetupService heroSetup;


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