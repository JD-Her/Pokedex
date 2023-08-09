package com.example.paletadoce

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PokemonCard(
    pokemon: Pokemon,
    modifier: Modifier = Modifier,
    onCardClicked: (Pokemon) -> Unit,
) {
    Card(
        modifier = modifier.clickable {
            onCardClicked.invoke(pokemon)
        },
        elevation = 8.dp,
        shape = RoundedCornerShape(24.dp)
    ) {
        Column {
            Thumb(thumb = pokemon.thumb)
            PokemonName(name = pokemon.name)

        }
    }
}

@Composable
fun PokemonName(name: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            //.background(MaterialTheme.colors.onBackground)
            .padding(8.dp)
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.h6
        )
    }
}

@Composable
fun Thumb(thumb: String) {
    Box(
        modifier = Modifier
            .height(140.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            model = thumb,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            MaterialTheme.colors.background,
                            Color(0xFFfff2df)
                        )
                    )
                ),
            contentScale = ContentScale.Crop
        )
    }
}