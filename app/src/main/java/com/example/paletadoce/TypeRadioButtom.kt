package com.example.paletadoce

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp

@Composable
fun TypeRadioButtom(tipoSelected: String, onItemSelected:(String)-> Unit) {


    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth().clip(CircleShape).background(Color.White).padding(top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            RadioButton(selected = tipoSelected == PokemonType.ELECTRIC.toString(),
                onClick = { onItemSelected(PokemonType.ELECTRIC.toString()) },
                modifier = Modifier.size(20.dp).padding(start = 8.dp))
            Text(text = PokemonType.ELECTRIC.toString(), fontStyle = FontStyle.Italic)
            Divider(modifier = Modifier
                .height(0.dp)
                .width(1.dp))

            RadioButton(selected = tipoSelected == PokemonType.GRASS.toString(),
                onClick = { onItemSelected (PokemonType.GRASS.toString())},
                modifier = Modifier.size(20.dp).padding(start = 8.dp))
            Text(text = PokemonType.GRASS.toString(), fontStyle = FontStyle.Italic)
            Divider(modifier = Modifier
                .height(0.dp)
                .width(1.dp))

            RadioButton(selected = tipoSelected == PokemonType.WATER.toString(),
                onClick = { onItemSelected(PokemonType.WATER.toString() )},
                modifier = Modifier.size(20.dp).padding(start = 8.dp))
            Text(text = PokemonType.WATER.toString(), fontStyle = FontStyle.Italic)
            Divider(modifier = Modifier
                .height(0.dp)
                .width(1.dp))

            RadioButton(selected = tipoSelected == PokemonType.NINGUNO.toString(),
                onClick = { onItemSelected (PokemonType.NINGUNO.toString())},
                modifier = Modifier.size(20.dp).padding(start = 8.dp))
            Text(text = PokemonType.NINGUNO.toString(), fontStyle = FontStyle.Italic)
            Divider(modifier = Modifier
                .height(0.dp)
                .width(1.dp))
        }
    }
}
