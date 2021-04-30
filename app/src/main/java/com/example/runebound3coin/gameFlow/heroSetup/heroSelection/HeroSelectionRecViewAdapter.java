package com.example.runebound3coin.gameFlow.heroSetup.heroSelection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameData.currentGameData.player.Player;
import com.example.runebound3coin.gameData.staticData.entity.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroSelectionRecViewAdapter extends RecyclerView.Adapter<HeroSelectionRecViewAdapter.HeroSelectionViewHolder> {

    private  List<Hero> availableHeroes = new ArrayList<>();
    private Context context;

    public HeroSelectionRecViewAdapter(Context context) {
        this.context = context;
    }

    public void setAvailableHeroes(List<Hero> availableHeroes) {
        this.availableHeroes = availableHeroes;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public HeroSelectionRecViewAdapter.HeroSelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_list_template, parent, false);
        return new HeroSelectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroSelectionRecViewAdapter.HeroSelectionViewHolder holder, int position) {
        Hero hero = availableHeroes.get(position);
        holder.heroName.setText(hero.getName());
        //TODO: implement image retrieval from database
//        Glide.with(context)
//                .asBitmap()
//                .load()
//                .into(holder.heroImage);
    }




    @Override
    public int getItemCount() {
        return availableHeroes.size();
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
