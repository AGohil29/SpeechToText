package com.example.arunr.speechtotext.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.arunr.speechtotext.model.Song;
import com.example.arunr.speechtotext.R;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongViewHolder> {

    private List<Song> songsList;
    private int rowLayout;
    private Context context;


    public static class SongViewHolder extends RecyclerView.ViewHolder {

        // Completed - use itemView of viewholder to reference the views directly

        CardView songsListLayout;
        ImageView movieImage;
        TextView songTitle;

        public SongViewHolder(View view) {
            super(view);

            songsListLayout = itemView.findViewById(R.id.card_view);
            movieImage = itemView.findViewById(R.id.movie_image);
            songTitle = itemView.findViewById(R.id.song_title);
        }
    }

    public SongsAdapter(List<Song> songsList, int rowLayout, Context context) {
        this.songsList = songsList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        try {
                holder.songTitle.setText(songsList.get(position).getName());
                // url for image
                String url = songsList.get(position).getImage().getImage100x100().get(0);
                Glide.with(context)
                        .load(url)
                        .apply(new RequestOptions()
                            .placeholder(R.drawable.ic_launcher))
                        .into(holder.movieImage);
            } catch(IllegalStateException e){
                e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }
}
