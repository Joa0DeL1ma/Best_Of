package com.example.bestof.modules.home.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bestof.R
import com.example.bestof.ui.theme.BestOfTheme

@Composable
fun ProductsListRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Headsets",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(start = 12.dp, bottom = 4.dp)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(3) {
                ProductItem()
            }
        }
    }
}

@Composable
fun ProductItem() {
    Column() {
        Box(
            modifier = Modifier
                .size(160.dp)
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
                modifier = Modifier
                    .padding(4.dp)
                    .align(Alignment.Center)
            )
            Box(
                modifier = Modifier
                    .padding(6.dp)
                    .background(Color.White )
                    .size(36.dp)
                    .align(Alignment.TopStart)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_products_medal),
                contentDescription = "Medalha",
                tint = Color(0xfff4af3f),
                modifier = Modifier
                    .padding(6.dp)
                    .size(36.dp)
                    .align(Alignment.TopStart)
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Column (modifier = Modifier.padding(start = 1.dp)) {
                Text(
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    text = "Sony WH-1000XM5Sa",
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier
                        .width(100.dp)
                        .padding(start = 4.dp, top = 6.dp, bottom = 4.dp),
                    fontSize = 10.sp
                )
                Row {
                    Text(
                        maxLines = 1,
                        text = "U$",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.padding(start = 4.dp, top = 0.dp, bottom = 4.dp),
                    )
                    Text(
                        maxLines = 1,
                        text = "2000,00",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.padding(start = 4.dp, top = 0.dp, bottom = 4.dp),
                    )
                }
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.End
            ) {
                Row {
                    Icon(
                        modifier = Modifier
                            .align(Alignment.Bottom)
                            .padding(bottom = 3.dp)
                            .size(16.dp),
                        painter = painterResource(id = R.drawable.ic_star_filled),
                        contentDescription = "Estrela preenchida"
                    )
                    Text(
                        modifier = Modifier.padding(end = 0.dp, bottom = 1.dp),
                        text = "4.7",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Row {
                    Text(
                        modifier = Modifier.padding(top = 6.dp),
                        text = "8.6k reviews",
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun ProductsListRowPreview() {
    BestOfTheme { ProductsListRow() }
}