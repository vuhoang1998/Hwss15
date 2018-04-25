package com.example.hoang.ss14.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hoang on 4/15/2018.
 */

public interface MusicService {
    @GET("api")
    Call<MusicTypeResponse> getListMusicTypes();

}
