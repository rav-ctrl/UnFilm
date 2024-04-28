package com.example.unfilm.movielist.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.unfilm.movielist.data.repository.MovieListRepositoryImpl
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel: MViewModel by lazy {
        ViewModelProvider(this)[MViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.movies.observe(this) {
            if (it.isNotEmpty())
                Toast.makeText(this, it[0].original_title, Toast.LENGTH_LONG).show()
        }
    }
}