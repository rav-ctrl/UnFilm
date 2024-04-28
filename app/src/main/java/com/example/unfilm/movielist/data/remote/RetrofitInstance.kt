package com.example.unfilm.movielist.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofitInstance by lazy {
        Retrofit.Builder()
            .baseUrl(MOVIES_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }

    val movieApi: MovieListApi by lazy {
        retrofitInstance.create(MovieListApi::class.java)
    }

    private const val MOVIES_BASE_URL = "https://api.themoviedb.org/3/movie/"
    const val API_KEY = "deb820010e3fa6b5c55e99522013a6ed"
}