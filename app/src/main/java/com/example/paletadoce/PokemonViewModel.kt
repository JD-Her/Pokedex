package com.example.paletadoce

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PokemonViewModel : ViewModel() {

    /**State de la consulta (SearchBar)*/
    var consulta by mutableStateOf("")
        private set

    /**Funcion consultar (SearchBar)*/
    fun onConsultaChange(newConsulta: String) {
        consulta = newConsulta
    }

    /**State de la seleccion (RadioButton)*/
    var selected by mutableStateOf("")
        private set


    private var _lista: MutableState<List<Pokemon>> = mutableStateOf(emptyList())
    val list: State<List<Pokemon>>
        get() = _lista

    init {
        _lista.value = listOf(
            Pokemon(
                name = "Pikachu",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png",
                speciality = "Cola de rayo",
                pokemonType = PokemonType.ELECTRIC,
                attack = "80",
                defense = "70"
            ),
            Pokemon(
                name = "Bulvasaur",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
                speciality = "Kick",
                pokemonType = PokemonType.GRASS,
                attack = "78",
                defense = "60"
            ),
            Pokemon(
                name = "Squirtle",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
                speciality = "Control",
                pokemonType = PokemonType.WATER,
                attack = "100",
                defense = "99"
            ),
            Pokemon(
                name = "Dratini",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png",
                speciality = "Aguaso",
                pokemonType = PokemonType.WATER,
                attack = "78",
                defense = "60"
            ),
            Pokemon(
                name = "Oddish",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png",
                speciality = "Torrente",
                pokemonType = PokemonType.GRASS,
                attack = "60",
                defense = "67"
            ),
            Pokemon(
                name = "Voltorb",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png",
                speciality = "Vista Lince",
                pokemonType = PokemonType.ELECTRIC,
                attack = "70",
                defense = "70"
            ),
            Pokemon(
                name = "Nidoran",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png",
                speciality = "Poison",
                pokemonType = PokemonType.GRASS,
                attack = "40",
                defense = "40"
            ),
            Pokemon(
                name = "Krabby",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png",
                speciality = "Hierba",
                pokemonType = PokemonType.WATER,
                attack = "30",
                defense = "40"
            ),
            Pokemon(
                name = "Electrode",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png",
                speciality = "Humidity",
                pokemonType = PokemonType.ELECTRIC,
                attack = "60",
                defense = "70"
            ),
            Pokemon(
                name = "Gyarados",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png",
                speciality = "Levitation",
                pokemonType = PokemonType.WATER,
                attack = "40",
                defense = "30"
            ),
            Pokemon(
                name = "Zapdos",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png",
                speciality = "Levitation",
                pokemonType = PokemonType.ELECTRIC,
                attack = "40",
                defense = "30"
            ),
            Pokemon(
                name = "Charizard",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
                speciality = "Levitation",
                pokemonType = PokemonType.GRASS,
                attack = "40",
                defense = "30"
            )
        )
    }

    fun retornaListaDePokemon(): List<Pokemon> {
        val listaDePokemon = listOf(
            Pokemon(
                name = "Pikachu",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png",
                speciality = "Cola de rayo",
                pokemonType = PokemonType.ELECTRIC,
                attack = "80",
                defense = "70"
            ),
            Pokemon(
                name = "Bulvasaur",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
                speciality = "Kick",
                pokemonType = PokemonType.GRASS,
                attack = "78",
                defense = "60"
            ),
            Pokemon(
                name = "Squirtle",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
                speciality = "Control",
                pokemonType = PokemonType.WATER,
                attack = "100",
                defense = "99"
            ),
            Pokemon(
                name = "Dratini",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png",
                speciality = "Aguaso",
                pokemonType = PokemonType.WATER,
                attack = "78",
                defense = "60"
            ),
            Pokemon(
                name = "Oddish",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png",
                speciality = "Torrente",
                pokemonType = PokemonType.GRASS,
                attack = "60",
                defense = "67"
            ),
            Pokemon(
                name = "Voltorb",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png",
                speciality = "Vista Lince",
                pokemonType = PokemonType.ELECTRIC,
                attack = "70",
                defense = "70"
            ),
            Pokemon(
                name = "Nidoran",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png",
                speciality = "Poison",
                pokemonType = PokemonType.GRASS,
                attack = "40",
                defense = "40"
            ),
            Pokemon(
                name = "Krabby",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png",
                speciality = "Hierba",
                pokemonType = PokemonType.WATER,
                attack = "30",
                defense = "40"
            ),
            Pokemon(
                name = "Electrode",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png",
                speciality = "Humidity",
                pokemonType = PokemonType.ELECTRIC,
                attack = "60",
                defense = "70"
            ),
            Pokemon(
                name = "Gyarados",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png",
                speciality = "Levitation",
                pokemonType = PokemonType.WATER,
                attack = "40",
                defense = "30"
            ),
            Pokemon(
                name = "Zapdos",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png",
                speciality = "Levitation",
                pokemonType = PokemonType.ELECTRIC,
                attack = "40",
                defense = "30"
            ),
            Pokemon(
                name = "Charizard",
                thumb = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
                speciality = "Levitation",
                pokemonType = PokemonType.GRASS,
                attack = "40",
                defense = "30"
            )
        )
        val pokemonList = ArrayList<Pokemon>()
        listaDePokemon.forEach { pokemonDeLaLista ->
            pokemonList.add(
                Pokemon(
                    pokemonDeLaLista.name,
                    pokemonDeLaLista.thumb,
                    pokemonDeLaLista.speciality,
                    pokemonDeLaLista.pokemonType,
                    pokemonDeLaLista.attack,
                    pokemonDeLaLista.defense
                )
            )
        }
        return pokemonList
    }


    fun onItemSelected(newSelection: String) {
            val filtrarLista = retornaListaDePokemon()
            val listaFiltrada = ArrayList<Pokemon>()
            selected = newSelection
            if (selected.isEmpty()) {
                _lista.value = filtrarLista
            } else {
                filtrarLista.forEach { pokemon ->
                    if (pokemon.pokemonType.toString() == selected) {
                        listaFiltrada.add(pokemon)
                    }
                }
                _lista.value = listaFiltrada
            }
        }

    fun realizarBusqueda(consulta: String) {
        val allPokemonList = retornaListaDePokemon()
        val listaFiltrada = ArrayList<Pokemon>()
        if (consulta.isEmpty()) {
            _lista.value = allPokemonList
        } else {
            allPokemonList.forEach { pokemon ->
                if (pokemon.name.lowercase()
                        .contains(consulta.lowercase()) && pokemon.pokemonType.toString() == selected
                ) {
                    listaFiltrada.add(pokemon)
                }
            }
            _lista.value = listaFiltrada
        }
    }

    fun filtrarPokemon(consulta: String, newSelected: String) {
        val pokemonList = retornaListaDePokemon()
        val listaFiltrada = ArrayList<Pokemon>()
        selected = newSelected
        if (selected.isEmpty() && consulta.isEmpty()) {
            _lista.value = pokemonList
        } else {
            pokemonList.forEach { pokemon ->
                if (selected.isEmpty()) {
                    pokemonList.filter { it.name.lowercase().contains(consulta.lowercase()) }
                    listaFiltrada.add(pokemon)
                } else {
                    if (consulta.isEmpty() && selected == newSelected) {
                        pokemonList.filter { it.pokemonType.toString() == selected }
                        listaFiltrada.add(pokemon)
                    } else {
                        pokemonList.filter {
                            it.name.lowercase()
                                .contains(consulta.lowercase()) && it.pokemonType.toString() == selected
                        }
                        listaFiltrada.add(pokemon)
                    }
                }
            }
            _lista.value = listaFiltrada
        }
    }
}


/*
* */

