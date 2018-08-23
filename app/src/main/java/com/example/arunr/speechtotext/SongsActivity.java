package com.example.arunr.speechtotext;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.arunr.speechtotext.adapter.SongsAdapter;
import com.example.arunr.speechtotext.model.Song;
import com.example.arunr.speechtotext.model.SongsResponse;
import com.example.arunr.speechtotext.rest.ApiClient;
import com.example.arunr.speechtotext.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SongsActivity extends AppCompatActivity {

    private static final String TAG = SongsActivity.class.getSimpleName();
    private static final String SEARCH_INPUT = "search_input";
    private String searchInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        // see if images load faster?
        recyclerView.setItemViewCacheSize(20);

        Intent intentThatStartedThisActivity = getIntent();

        // check if this intent has extra that we passed from MainActivity
        if (intentThatStartedThisActivity.hasExtra(SEARCH_INPUT)) {
            searchInput = intentThatStartedThisActivity.getStringExtra(SEARCH_INPUT);
        }

        // Todo - show loading indicator while the data is loaded
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<SongsResponse> call = apiService.getSearchedSongs(searchInput);
        call.enqueue(new Callback<SongsResponse>() {
            @Override
            public void onResponse(Call<SongsResponse> call, Response<SongsResponse> response) {
                try {
                    int statusCode = response.code();
                    List<Song> songs = response.body().getResponse();
                    recyclerView.setAdapter(new SongsAdapter(songs, R.layout.list_item_songs, getApplicationContext()));
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<SongsResponse> call, Throwable t) {
                // log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
