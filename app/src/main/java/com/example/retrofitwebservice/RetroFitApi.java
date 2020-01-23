package com.example.retrofitwebservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroFitApi {
    @GET("posts")
    Call<List<User>> list1();
}
