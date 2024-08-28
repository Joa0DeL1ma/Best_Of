package com.example.bestof.modules.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bestof.modules.home.widgets.ImageCarousel
import com.example.bestof.R
import com.example.bestof.modules.home.widgets.ProductInformation
import com.example.bestof.ui.theme.BestOfTheme


@Composable
fun ProductScreen() {
    val images = listOf(
        R.drawable.sonywh1000xm5,
        R.drawable.sonywh1000xm5,
        R.drawable.sonywh1000xm5,
        R.drawable.sonywh1000xm5,
        R.drawable.sonywh1000xm5,
    )
    Column {
        Column(modifier = Modifier.weight(1f)) {
            ImageCarousel(images)
            ProductInformation(modifier = Modifier.fillMaxWidth())
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductScreenPreview() {
    BestOfTheme {
        ProductScreen()
    }
}