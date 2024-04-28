package com.example.unfilm.movies.data.repository

import com.example.unfilm.movies.data.remote.RetrofitInstance
import com.example.unfilm.movies.data.remote.response.MovieListDto
import com.example.unfilm.movies.domain.repository.MoviesRepository

object MoviesRepositoryImpl : MoviesRepository {
    override suspend fun getPopularMovies(): MovieListDto? {
        val response = RetrofitInstance.moviesApi.getPopularMovies()

        val lol = "Response Code: ${response.code()} Error Message: ${response.message()}"

        if (response.isSuccessful && response.body() != null) return response.body()
        else {
            println(response)
        }

        return null
    }
}