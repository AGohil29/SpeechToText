package com.example.arunr.speechtotext;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.arunr.speechtotext.R;

public class SongsActivity extends AppCompatActivity {

    private static final String SEARCH_INPUT = "search_input";
    private String searchInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Intent intentThatStartedThisActivity = getIntent();

        // check if this intent has extra that we passed from MainActivity
        if (intentThatStartedThisActivity.hasExtra(SEARCH_INPUT)) {
            searchInput = intentThatStartedThisActivity.getStringExtra(SEARCH_INPUT);
        }
    }
}
