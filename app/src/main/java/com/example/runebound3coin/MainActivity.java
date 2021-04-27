package com.example.runebound3coin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.runebound3coin.language.LanguageConfiguration;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    RadioGroup languageSelector;
    RadioButton choseEnglish;
    RadioButton chosePolish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choseEnglish = findViewById(R.id.langChoiceEn);
        chosePolish = findViewById(R.id.langChoicePl);
        languageSelector = findViewById(R.id.radioGroupForLangSelection);

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
}