package com.example.unfilm.movielist.data.repository

import com.example.unfilm.movielist.data.remote.RetrofitInstance
import com.example.unfilm.movielist.data.remote.response.MovieDto
import com.example.unfilm.movielist.domain.repository.MovieListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

object MovieListRepositoryImpl: MovieListRepository {
    override suspend fun getPopularMovies(): Flow<List<MovieDto>> {
        return flow {
            val response = RetrofitInstance.movieApi.getPopularMovies()

            if (response.isSuccessful) {
                response.body()?.let {
                    emit(it.results)
                }
            } else {
                println(response.message())
            }
            emit(listOf())
        }.flowOn(Dispatchers.IO)
    }
}