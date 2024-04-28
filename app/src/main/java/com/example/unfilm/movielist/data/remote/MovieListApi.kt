package com.example.unfilm.movielist.data.remote

import com.example.unfilm.movielist.data.remote.response.MovieListDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieListApi {

    @GET("popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String = RetrofitInstance.API_KEY): Response<MovieListDto>
}