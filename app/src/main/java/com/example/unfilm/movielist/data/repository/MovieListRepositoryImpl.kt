package com.example.unfilm.movielist.data.repository

import com.example.unfilm.movielist.data.remote.RetrofitInstance
import com.example.unfilm.movielist.data.remote.response.MovieDto
import com.example.unfilm.movielist.domain.repository.MovieListRepository

object MovieListRepositoryImpl: MovieListRepository {
    override suspend fun getPopularMovies(): List<MovieDto> {
        val response = RetrofitInstance.movieApi.getPopularMovies()

        if (response.isSuccessful) {
            response.body()?.let {
                return it.results
            }
        } else {
            println(response.message())
        }
        return listOf()
    }
}