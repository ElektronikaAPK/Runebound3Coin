package com.example.runebound3coin.gameFlow.heroSetup.heroSelection;

import android.content.Context;
import android.content.Intent;
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
import com.example.runebound3coin.gameFlow.heroSetup.PlayerSetupService;
import com.example.runebound3coin.gameFlow.heroSetup.players.PlayerSetupActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

public class HeroSelectionRecViewAdapter extends RecyclerView.Adapter<HeroSelectionRecViewAdapter.HeroSelectionViewHolder> {



    private  List<Hero> availableHeroes = new ArrayList<>();
    private Context context;
    private int playerBeingSet;

    public HeroSelectionRecViewAdapter(Context context) {
        this.context = context;
    }

    public int getPlayerBeingSet() {
        return playerBeingSet;
    }

    public void setPlayerBeingSet(int playerBeingSet) {
        this.playerBeingSet = playerBeingSet;
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

        holder.parent.setOnClickListener(x -> {
            Intent intent = new Intent(context, PlayerSetupActivity.class);
            intent.putExtra("isPlayerPicked", true);
            intent.putExtra("heroId", hero.getId());
            intent.putExtra("playerId", playerBeingSet);
            context.startActivity(intent);


        });

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
            parent = itemView.findViewById(R.id.hero_template_parent);
            heroImage = itemView.findViewById(R.id.heroImg);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
