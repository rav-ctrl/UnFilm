package com.example.unfilm.movielist.domain.repository

import com.example.unfilm.movielist.data.remote.response.MovieDto
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getPopularMovies(): Flow<List<MovieDto>>
}