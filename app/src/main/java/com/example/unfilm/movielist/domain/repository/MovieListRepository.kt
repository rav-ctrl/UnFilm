package com.example.unfilm.movielist.domain.repository

import com.example.unfilm.movielist.data.remote.response.MovieDto

interface MovieListRepository {
    suspend fun getPopularMovies(): List<MovieDto>
}