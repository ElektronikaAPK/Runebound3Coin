package com.example.runebound3coin.gameFlow.heroSetup.heroSelection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameData.staticData.entity.Hero;
import com.example.runebound3coin.gameFlow.heroSetup.PlayerSetupService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

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
    }

}