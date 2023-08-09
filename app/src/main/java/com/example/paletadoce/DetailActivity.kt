package com.example.paletadoce

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.paletadoce.ui.theme.PaletaDoceTheme

class DetailActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaletaDoceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val pokemonInf = intent.getParcelableExtra("pokemon_key", Pokemon::class.java)
                    DetailScreen(
                        name =pokemonInf?.name ?: "value",
                        thumb =pokemonInf?.thumb ?: "value",
                        pokemonType =pokemonInf?.pokemonType ?: PokemonType.NINGUNO,
                        speciality =pokemonInf?.speciality ?: "value",
                        attack =pokemonInf?.attack ?: "0",
                        defense =pokemonInf?.defense ?: "0"
                    )
                }
            }
        }
    }
}
