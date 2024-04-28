package com.example.unfilm.movies.data.repository

import com.example.unfilm.movies.data.remote.RetrofitInstance
import com.example.unfilm.movies.data.remote.response.MovieListDto
import com.example.unfilm.movies.domain.repository.MoviesRepository

class MoviesRepositoryImpl: MoviesRepository {
    override suspend fun getPopularMovies(): MovieListDto {
        return RetrofitInstance.moviesApi.getPopularMovies()
    }
}