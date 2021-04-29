package com.example.runebound3coin.gameFlow.heroSetup;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.runebound3coin.R;
import com.example.runebound3coin.gameFlow.player.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

public class PlayerRecViewAdapter extends RecyclerView.Adapter<PlayerRecViewAdapter.HeroSelectionViewHolder> {

    private Context context;
    private List<Player> players = new ArrayList<>();

    public PlayerRecViewAdapter(Context context) {
        this.context = context;
    }

    @Inject
    HeroSetupService heroSetupService;

    @NonNull
    @Override
    public HeroSelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_selection_template, parent, false);
        return new HeroSelectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroSelectionViewHolder holder, int position) {
        holder.heroName.setText("to do");
        //to do when DB implemented
//        Glide.with(context)
//                .asBitmap()
//                .load()
//                .into(holder.heroImage);

    }

    public void setPlayers(List<Player> players) {
        this.players = players;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class HeroSelectionViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView heroImage;
        private TextView heroName;
        private EditText playerName;

        public HeroSelectionViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            heroImage = itemView.findViewById(R.id.heroImg);
            heroName = itemView.findViewById(R.id.heroName);
            playerName = itemView.findViewById(R.id.playerName);
        }
    }
}
