package com.example.paletadoce

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp


@Composable
fun PokemonList(
    // pokemonList: List<Pokemon>,
    viewModel: PokemonViewModel,
    onCardClicked: (Pokemon) -> Unit,
) {
    val pokemonList = viewModel.list.value

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        if (!pokemonList.isNullOrEmpty()) {
            items(pokemonList) {
                PokemonCard(
                    pokemon = it.copy(),
                    onCardClicked = onCardClicked
                )
            }
        }
    }
}

