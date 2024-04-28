package com.example.unfilm.movies.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(MoviesApi.POPULAR_MOVIE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    val moviesApi: MoviesApi by lazy {
        retrofit.create(MoviesApi::class.java)
    }
}