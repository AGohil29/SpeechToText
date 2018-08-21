package com.example.arunr.speechtotext.Adapter;

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
import com.example.arunr.speechtotext.Model.Song;
import com.example.arunr.speechtotext.R;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongViewHolder> {

    private List<Song> songs;
    private int rowLayout;
    private Context context;


    public static class SongViewHolder extends RecyclerView.ViewHolder {

        CardView songsLayout;
        ImageView movieImage;
        TextView songTitle;

        public SongViewHolder(View view) {
            super(view);

            songsLayout = (CardView) view.findViewById(R.id.card_view);
            movieImage = (ImageView) view.findViewById(R.id.movie_image);
            songTitle = (TextView) view.findViewById(R.id.song_title);
        }
    }

    public SongsAdapter(List<Song> songs, int rowLayout, Context context) {
        this.songs = songs;
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
        holder.songTitle.setText(songs.get(position).getName());
        // url for image
        String url = songs.get(position).getImage().getImage100x100().get(0);
        Glide.with(context)
                .load(url)
                .into(holder.movieImage);
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
