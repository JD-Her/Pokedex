package com.example.paletadoce

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.paletadoce.ui.theme.PaletaDoceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaletaDoceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen(
                        pokemonViewModel = PokemonViewModel(),
                        onCardClicked = ::onCardClicked
                    )
                }
            }
        }
    }

    fun onCardClicked(pokemon: Pokemon) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)

        intent.putExtra("pokemon_key", pokemon)
        startActivity(intent)
    }
}