package com.example.unfilm.movies.domain.repository

import com.example.unfilm.movies.data.remote.response.MovieListDto
import java.util.concurrent.Flow

interface MoviesRepository {

    fun getPopularMovies(): MovieListDto

}