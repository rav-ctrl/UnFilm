package com.example.unfilm.movies.data.remote

import com.example.unfilm.movies.data.remote.response.MovieListDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String = API_KEY): Response<MovieListDto>

    companion object {
        const val POPULAR_MOVIE_BASE_URL = "https://api.themoviedb.org/3/movie/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500/"
        const val API_KEY = "deb820010e3fa6b5c55e99522013a6ed"
    }
}