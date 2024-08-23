package com.example.bestof.modules.home.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R
import com.example.bestof.ui.theme.BestOfTheme

@Composable
fun ProductsListRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Headsets",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(start = 8.dp , bottom = 12.dp, top = 12.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(3) {
                ProductItem()
            }
        }
    }
}
@Composable
fun ProductItem() {
    val name = "Sony WH-1000XM5SSSSSSSSSSS"
    val maxLength = 17
    val displayText = if (name.length > maxLength) {
        name.take(maxLength) + "..."
    } else {
        name
    }

    Column(
        modifier = Modifier
            .width(180.dp) // Largura fixa para cada item
    ) {
        Box(
            modifier = Modifier
                .size(160.dp)
                .fillMaxWidth()
                .border(
                    width = 2.dp,
                    color = Color(0xffD9D9D9),
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.sonywh1000xm5),
                contentDescription = "Produto",
                contentScale = ContentScale.Fit,
                modifier = Modifier.padding(16.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 0.dp )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_products_medal),
                contentDescription = "Medalha",
                tint = Color(0xfff4af3f),
                modifier = Modifier.size(42.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "4,7",
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.width(2.dp))
            Row {
                repeat(4) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_star_filled),
                        contentDescription = "Estrela preenchida",
                        modifier = Modifier.padding(top = 4.dp).size(16.dp)
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.ic_star_half),
                    contentDescription = "Meia estrela",
                    modifier = Modifier.padding(top = 4.dp).size(16.dp)
                )
            }
        }
        Text(
            maxLines = 1,
            text = displayText,
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.padding(start = 4.dp, top = 0.dp, bottom = 4.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 2.dp)
        ) {
            IconButton(modifier = Modifier.padding(start = 48.dp, end = 4.dp).size(20.dp), onClick = {}) {
                Icon(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.ic_open_in_new_tab),
                    contentDescription = "Abrir em nova aba",
                    tint = Color.Gray,

                )
            }
            Text(
                modifier = Modifier,
                text = "R$ 4.200,00",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
            )

        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun ProductsListRowPreview() {
    BestOfTheme { ProductsListRow() }
}