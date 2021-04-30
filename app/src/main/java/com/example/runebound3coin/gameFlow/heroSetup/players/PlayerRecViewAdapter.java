package com.example.runebound3coin.gameFlow.heroSetup.players;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.runebound3coin.R;
import com.example.runebound3coin.gameData.currentGameData.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecViewAdapter extends RecyclerView.Adapter<PlayerRecViewAdapter.ActivePlayersViewHolder> {

    private Context context;
    private List<Player> players = new ArrayList<>();

    public PlayerRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ActivePlayersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list_template, parent, false);
        return new ActivePlayersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivePlayersViewHolder holder, int position) {
        String displayName;
        Player player = players.get(position);
        if (player.isActive()) displayName = player.getHero().getName();
        else displayName = context.getString(R.string.pickHero);
        holder.heroName.setText(displayName);
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

    public class ActivePlayersViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        private ImageView heroImage;
        private TextView heroName;
        private EditText playerName;

        public ActivePlayersViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            heroImage = itemView.findViewById(R.id.heroImg);
            heroName = itemView.findViewById(R.id.heroName);
            playerName = itemView.findViewById(R.id.playerName);
        }
    }
}
