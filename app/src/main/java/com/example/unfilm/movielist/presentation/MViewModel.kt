package com.example.unfilm.movielist.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import com.example.unfilm.movielist.data.remote.response.MovieDto
import com.example.unfilm.movielist.data.repository.MovieListRepositoryImpl
import kotlinx.coroutines.flow.flow

class MViewModel: ViewModel() {
    val movies = liveData {
        emitSource(MovieListRepositoryImpl.getPopularMovies().asLiveData())
    }
}
