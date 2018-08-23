package com.example.arunr.speechtotext.rest;

import com.example.arunr.speechtotext.model.SongsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("mic/get_response.php")
    Call<SongsResponse> getSearchedSongs(@Query("search") String searchInput);
}
