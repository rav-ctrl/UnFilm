package com.example.unfilm.movies.data.remote.response

data class MovieListDto(
    val page: Int,
    val movieDtos: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)