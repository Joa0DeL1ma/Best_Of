package com.example.bestof.modules.product.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R
import com.example.bestof.ui.theme.BestOfTheme

@Composable
fun ProductInformation(modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            text = "Sony WH-1000XM5Sa",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .width(250.dp)
                .padding(start = 16.dp, top = 6.dp),
        )
        Spacer(modifier = modifier.width(1.dp))
        Row(
            modifier = Modifier.padding(top = 1.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier,
                painter = painterResource(id = R.drawable.ic_star_filled),
                contentDescription = "Estrela preenchida",
                tint = Color(0xffde7921)
            )
            Text(
                modifier = Modifier.padding(bottom = 4.dp),
                text = "4.7",
                style = MaterialTheme.typography.headlineMedium
            )
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