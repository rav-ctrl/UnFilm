package com.example.unfilm.movies.data.remote

import retrofit2.http.GET

interface MoviesApi {

//    @GET
//    suspend fun getPopularMovies():

    companion object {
        const val POPULAR_MOVIE_BASE_URL = "https://api.themoviedb.org/3/movie/popular/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500/"
        const val API_KEY = "deb820010e3fa6b5c55e99522013a6ed"
    }
}