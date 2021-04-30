package com.example.runebound3coin.gameFlow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameFlow.heroSetup.players.PlayerSetupActivity;
import com.example.runebound3coin.configuration.language.LanguageConfiguration;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    RadioGroup languageSelector;
    RadioButton choseEnglish, chosePolish;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choseEnglish = findViewById(R.id.langChoiceEn);
        chosePolish = findViewById(R.id.langChoicePl);
        languageSelector = findViewById(R.id.radioGroupForLangSelection);
        start = findViewById(R.id.startButton);

    }


    public void changeLanguage(View view) {
        String languageCode = Locale.getDefault().getCountry();
        if (choseEnglish.isChecked()) languageCode = "en";
        if (chosePolish.isChecked()) languageCode = "pl";
        LanguageConfiguration.switchLocal(this, languageCode);
        hideChangeLanguageRadio();
    }

    private void hideChangeLanguageRadio() {
        languageSelector.setVisibility(View.INVISIBLE);
    }

    public void showChangeLanguageRadio(View view) {
        languageSelector.setVisibility(View.VISIBLE);
    }

    public void startGame(View view) {
        Intent intent = new Intent(view.getContext(), PlayerSetupActivity.class);
        startActivity(intent);
    }
}