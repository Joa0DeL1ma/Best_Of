package com.example.bestof.modules.product.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bestof.R
import com.example.bestof.ui.theme.BestOfTheme

@Composable
fun ProductInformation(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            overflow = TextOverflow.Ellipsis,
            maxLines = 2,
            text = "Steck, Câmera De Segurança Interna Ptz 360 Super HD (3MP), Wi-Fi, Áudio bi-direcional, Detecção de som e movimento, Visão noturna, Armazenamento Local 128gb, Compatível com Alexa - SMBC3BS1",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Normal, // todo ver de colocar aqui o fontWeight thin, talvez tirar dúvidas com Ale dps
            modifier = Modifier
                .width(400.dp)
        )
        Row(modifier = Modifier.padding(top = 8.dp)) {
            Text(
                modifier = Modifier.align(Alignment.Bottom),
                maxLines = 1,
                text = "U$ 3200,00",
                style = MaterialTheme.typography.headlineMedium,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = "4.7",
                style = MaterialTheme.typography.headlineMedium,
                fontSize = 26.sp
            )
            for (i in 1..5) {
                Icon(
                    modifier = Modifier
                        .padding(bottom = 1.dp)
                        .size(30.dp)
                        .align(Alignment.Bottom),
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "Estrela preenchida",
                    tint = Color(0xffde7921)
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Icon( //todo, fazer com que seja nullable, com que mude o tint dependendo da
                  //todo, posição do produto no ranking
                painter = painterResource(id = R.drawable.ic_products_medal),
                contentDescription = "Medalha",
                tint = Color(0xfff4af3f),
                modifier = Modifier
                    .size(26.dp)
            )
            Text(
                modifier = Modifier
                    .padding(end = 4.dp),
                text = "(8.600 Reviews)"
            )
        }
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "Product information",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Normal,
        )
        Text(
            style = MaterialTheme.typography.bodyMedium,
            text = "Bloqueia o mau cheiro do n°2 " +
                    "Elimina 99% das bactérias do vaso sanitário " +
                    "Composto por óleos essenciais naturais " +
                    "Seu banheiro ficará com cheiro agradável Composto por óleos" +
                    " essenciais naturais Composto por óleos essenciais naturais ",
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xffFFEA00),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Add to cart", style = MaterialTheme.typography.bodyLarge)
        }
        OutlinedButton(
            modifier = Modifier
                .padding(top = 4.dp)
                .fillMaxWidth(),
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Black
            )
        ) {
            Text(text = "Buy Now", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductInformationPrev() {
    BestOfTheme {
        ProductInformation()
    }
}