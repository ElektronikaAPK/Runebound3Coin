package com.example.runebound3coin.gameFlow.heroSetup.heroSelection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroSelectionActivity extends AppCompatActivity {

    List<Hero> possibleHeroes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_selection);
    }


    public class HeroSelectionViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView heroImage;
        private TextView heroName;

        public HeroSelectionViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            heroImage = itemView.findViewById(R.id.heroImg);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}