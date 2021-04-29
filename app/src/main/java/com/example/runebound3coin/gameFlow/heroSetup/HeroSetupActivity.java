package com.example.runebound3coin.gameFlow.heroSetup;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.runebound3coin.R;

import javax.inject.Inject;

public class HeroSetupActivity extends AppCompatActivity {

    @Inject
    HeroSetupService heroSetup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_setup);

    }
}