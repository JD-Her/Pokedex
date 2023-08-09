package com.example.paletadoce

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    pokemonViewModel: PokemonViewModel,
    onCardClicked: (Pokemon) -> Unit,

    ) {
    Surface(
        color = MaterialTheme.colors.onSecondary,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.pokemon_logo),
                contentDescription = stringResource(R.string.pokemon_logo_name),
                modifier = modifier
                    .fillMaxWidth(0.6f)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(18.dp))
            SearchBar(pokemonViewModel = pokemonViewModel)
            Spacer(modifier = Modifier.height(16.dp))
            TypeRadioButtom(
                tipoSelected = pokemonViewModel.selected,
                onItemSelected = {
                pokemonViewModel.filtrarPokemon(it, pokemonViewModel.selected)})
            Spacer(modifier = Modifier.height(16.dp))
            PokemonList(viewModel = pokemonViewModel, onCardClicked = onCardClicked)

        }
    }
}




